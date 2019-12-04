import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int calif;
		System.out.println("Introducir la calificacion: ");
		calif = scan.nextInt();
		if (calif == 10 || calif == 9) {
			System.out.println("Calificacion Sobresaliente!");
		} else if (calif == 8 || calif == 7) {
			System.out.println("Notable");
		} else if (calif == 6) {
			System.out.println("Bien");
		} else if (calif == 5) {
			System.out.println("Aprobado");
		} else if (calif == 0 || calif == 1 || calif == 2 || calif == 3 || calif == 4) {
			System.out.println("Suspenso");
		}else {
			System.out.println("Favor de capturar una calificacion entre 0 - 10");
		}
	}
}
