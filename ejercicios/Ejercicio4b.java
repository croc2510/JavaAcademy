import java.util.Scanner;

public class Ejercicio4b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int calif;
		System.out.println("Introducir la calificacion: ");
		calif = scan.nextInt();

		switch (calif) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
			default:
				System.out.println("Favor de capturar una calificacion entre 0 y 10");
				break;
		}
	}

}
