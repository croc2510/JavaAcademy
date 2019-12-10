package ejercicio1;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Imprimir tabla del numero: ");
			n = scan.nextInt();
			if (n > 20 || n < 1) {
				System.out.println("Introducir un numero que no sea mayor a 20 o menor que 1");
			}
		} while (n > 20 || n < 1);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		
	}
}
