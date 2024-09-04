package ar.edu.IES6.Informatica.punto03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdln=new Scanner(System.in);
		int num,i,f;
		i=0;
		f=1;
		//boolean band=true;
		System.out.print("Ingrese un numero entero : ");
		num=stdln.nextInt();
		while(num<0 || num>10) {
			System.out.println("Error de ingreso");
			System.out.print("Ingrese un numero Entero : ");
			num=stdln.nextInt();
		}
		while(i<num) {
		  i++;
		  f=f*i;
		}
		System.out.println("El Factorial del Nuemro es :"+f);
	}

}
