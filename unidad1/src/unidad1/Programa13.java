package unidad1;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int resp;
	do {
		
		int np,ni=0,acum=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Cuantos numeros pares quieres sumar ");
		np=leer.nextInt();
		for (int i=0;i<=np;i++) {
		System.out.println(ni);
		acum+=ni;
		ni+=2;
		
		}
		System.out.println("La suma de los numeros es: "+acum);
		System.out.println("Quiere volver a sumar numeros(1=si  2=no)");
		resp=leer.nextInt();
	} while (resp==1);
	}

}
