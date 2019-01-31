package unidad1;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		double f,c;
		System.out.println("Ingrese temperatura en grados Fahrenheit");
		f=leer.nextDouble();
		c=(f-32)/1.8;
		System.out.println("fahrenheit "+f+"en centigrados es "+c);
	}

}
