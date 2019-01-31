package unidad1;
import java.util.Scanner;
public class Programa03 {
	public static void main (String [] args) {
		Scanner leer=new Scanner(System.in);
		String nombre;
		int edad;
		double estatura;
		System.out.println("Ingrese su nombre");
		nombre=leer.nextLine();
		System.out.println("Ingrese su edad");
		edad=leer.nextInt();
		System.out.println("Ingrese su Estatura");
		estatura=leer.nextDouble();
		System.out.println("Hola "+nombre + "Tu edad es de "+edad  + "Y tu estatura es de"+estatura);
		
	}
}
