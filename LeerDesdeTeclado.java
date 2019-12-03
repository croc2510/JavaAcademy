import java.util.Scanner;

public class LeerDesdeTeclado{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cual es tu nombre?");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre+ "vamos por un cafe?");
	}
}