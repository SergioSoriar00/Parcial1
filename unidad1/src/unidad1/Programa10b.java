package unidad1;

import java.util.Scanner;

public class Programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leer= new Scanner(System.in);
    int num, acum=0;
    double prom;
    do {
		System.out.println("Ingrese numeros menores que 76");
		num=leer.nextInt();
		acum+=num;
	} while (num<=76);
    prom=acum/num;
    System.out.println("El promedio es"+prom);
	}

}
