package ar.edu.IES6.Informatica.punto02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdln=new Scanner(System.in);
		int num;
		System.out.print("Ingrese Un Numero Entero : ");
		num=stdln.nextInt();
		if (num % 2==0){
			System.out.println("Es Par "+num);
			System.out.println("El Triple del Numero es : "+num*3);
		}else {
			System.out.println("Es Impar"+num);
			System.out.println("El doble del Numero es : "+num*2);
		}
		
	}

}
