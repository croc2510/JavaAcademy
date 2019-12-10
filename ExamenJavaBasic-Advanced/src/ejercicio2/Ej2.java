package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int n2;

		do {
			System.out.println("Introducir primer valor: ");
			n = scan.nextInt();
			if (n < 1) {
				System.out.println("Dame un valor mayor a 0");
			}
		} while (n < 1);

		do {
			System.out.println("Introducir segundo valor: ");
			n2 = scan.nextInt();
			if (n2 < 1) {
				System.out.println("Dame un valor mayor a 0");
			}
		} while (n2 < 1);

		if (n > 21 && n2 > 21) {
			System.out.println("0");
		}
		if (n < 22 || n2 < 22) {
			if (n < n2) {

				System.out.println(n);
			}
			if (n2 < n) {
				System.out.println(n2);
			}
		}

	}

}
