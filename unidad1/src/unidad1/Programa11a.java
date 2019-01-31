package unidad1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte nEmpleados, i;
		double sueldo=0.0, maximo=0.0, minimo=9999999, total=0.0, isr=0.0;
		
		Scanner leer=new Scanner (System.in);
		
		DecimalFormat formateador= new DecimalFormat("###,###.##");
		
		System.out.println("Ingrea el numero de empleados");
		nEmpleados=leer.nextByte();
		i=1;
		
		do {
			System.out.println("Ingresar el suledo del emplado"+i+":");
			sueldo=leer.nextDouble();
			total+=sueldo;
			if (sueldo<minimo) {
				minimo=sueldo;
			}
			if (sueldo>maximo) {
				maximo=sueldo;
			}
			i++;
		}while(i<=nEmpleados);
		
		isr=total+0.33;
		System.out.println("el total es"+formateador.format(total));
		System.out.println("el ISR es"+formateador.format(isr));
		System.out.println("Salario Maximo"+formateador.format(maximo));
		System.out.println("Salario Minimo"+formateador.format(minimo));
	}

}
