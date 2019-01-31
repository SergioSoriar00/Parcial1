package unidad1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int op;
		double Pul,pie,con;
		System.out.println("Menu");
		System.out.println("1.- Pulgadas a centimetros");
		System.out.println("2.- Pies a centimetros");
	    System.out.println("3.- Pies a pulgadas");
	    System.out.println("Elige una opcion");
	    op =leer.nextInt();
	    switch (op) {
		case 1:
			System.out.println("Ingrese las pulgadas");
			Pul=leer.nextDouble();
			con=(Pul*2.54);
			System.out.println("Pulgadas "+Pul+" igual a" +con+" en centimetros");
			break;
		case 2:
			
			break;
		case 3:
	
	break;

		default:
			break;
		}

	}

}
