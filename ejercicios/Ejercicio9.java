import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Numero1, Numero2, choice, suma;
		do {
			System.out.println("Dame el primer numero ");
			Numero1 = scan.nextInt();
			System.out.println("Dame el segundo numero ");
			Numero2 = scan.nextInt();
			suma = Numero1 + Numero2;
			System.out.println("La suma de los numero es: " + suma);
			System.out.println("Quieres sumar de nuevo?(Teclea cualquier numero para continuar o Teclea 0 para salir)");
			choice = scan.nextInt();
		} while (choice != 0);
	}

}
