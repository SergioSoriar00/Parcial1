package unidad1;

import java.util.Scanner;

public class Programa05 {
	public static void main (String [] args) {
		Scanner leer=new Scanner(System.in);
		int calif;
		System.out.println("Ingrese su calificacion");
		calif=leer.nextInt();
		if (calif>=80) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Reprobado");
		}
	}

}
