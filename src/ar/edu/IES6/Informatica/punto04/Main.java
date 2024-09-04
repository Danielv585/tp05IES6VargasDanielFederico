package ar.edu.IES6.Informatica.punto04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int num,i;
		boolean band=true;
		System.out.print("Ingrese un numeo entre 1 a 9 :");
		num=stdln.nextInt();
		while(band) {
			if(num>=1 && num<=9) {
				band=false;
			}else {
				System.out.println("Error de Ingreso");
				System.out.print("Digite un numero entre 1 a 9 :");
				num=stdln.nextInt();
			}
		}
		for(i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+i*num);
		}
	}

}
