package ar.edu.IES6.Informatica.punto02;
import java.util.InputMismatchException;//tratamiento de Error
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdln=new Scanner(System.in);
		int num;
		boolean continua;
		do {
			try {
				continua=false;
				System.out.print("Ingrese Un Numero Entero : ");
				num=stdln.nextInt();
				if (num % 2==0){
					System.out.println("Es Par "+num);
					System.out.println("El Triple del Numero es : "+num*3);
				}else {
					System.out.println("Es Impar"+num);
					System.out.println("El doble del Numero es : "+num*2);
				}
			}catch(InputMismatchException ex){
				stdln.next();
				continua=true;
			}
			
		}while(continua);
			
	}

}
