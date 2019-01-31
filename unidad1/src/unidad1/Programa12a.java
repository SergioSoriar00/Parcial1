package unidad1;

import java.util.Scanner;

public class Programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int np,np200=0;
		int np400 = 0;
		double precio,acum;
		Scanner leer=new Scanner(System.in);
		System.out.println("Cuantos productos son");
		np=leer.nextInt();
		for (int i = 1; i<=np; i++) {
			System.out.println("Precio del producto");
			precio=leer.nextDouble();
			if (precio>0 && precio<=200) {
				np200++;
			}
			if (precio>200 && precio<=400) {
				np400++;
			}
			System.out.println("El numero de productos vendidos con precio de 200 o menos son: "+np200);
			System.out.println("El numero de productos vendidos con precio de 400 y 200 es: "+np400);
		}

	}

}
