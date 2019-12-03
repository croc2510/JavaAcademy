package com.softtek.java.academy.ejercicios;
import java.util.Scanner;
public class SumLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Numero1, Numero2,choice,suma;
		do {
			System.out.println("Dame el primer numero ");
			Numero1 = scan.nextInt();
			System.out.println("Dame el segundo numero ");
			Numero2 = scan.nextInt();
			suma = Numero1 + Numero2;
			System.out.println("La suma de los numero es: "+suma);
			System.out.println("Quieres sumar de nuevo?(Teclea 0 si no)");
			choice = scan.nextInt();
		}while(choice != 0);
	}
}
