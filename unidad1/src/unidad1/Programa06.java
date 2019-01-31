package unidad1;

import java.util.Scanner;

public class Programa06 {
	public static void main (String [] args) {
		Scanner leer=new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero entero");
		numero=leer.nextInt();
		if(numero%2 == 0){
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}

}
