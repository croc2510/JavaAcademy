package ejercicio5;

import java.util.Scanner;
import ejercicio5Interface.Calc;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, op = 0;
		Calc ope = new Calc();
		do {

			System.out.println("Primer numero: ");
			n1 = scan.nextInt();

			System.out.println("Segundo numero: ");
			n2 = scan.nextInt();

			System.out.println("Elegir la operacion: \n1) Suma\n2) Resta\n3) Multiplicacion\n4) Division");
			op = scan.nextInt();
			switch (op) {
			case 1:
				System.out.println(ope.suma(n1, n2));
				break;
			case 2:
				System.out.println(ope.resta(n1, n2));
				break;
			case 3:
				System.out.println(ope.multiplicacion(n1, n2));
				break;
			case 4:
				System.out.println(ope.division(n1, n2));
				break;
			default:
				System.out.println("No se eligio una opcion valida");
			}
			System.out.println("Introducir 0 para salir, otro numero para volver a hacer una operacion");
			op = scan.nextInt();
		} while (op != 0);
	}

}
