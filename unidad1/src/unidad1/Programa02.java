package unidad1;
import java.util.Scanner;
public class Programa02 {
	public static void main (String [] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingre su nombre");
		String nombre;
		nombre=leer.nextLine();
		System.out.println("Hola "+nombre);
	}

}
