package com.softtek.java.academy.ejercicios;

import java.util.Scanner;

public class Pino {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row;

		do {
			System.out.println("Cuantas lineas quiere imprimir (de 1 a 10)");
			row = scan.nextInt();
		} while (row > 10);
		
		do {
			for(int i = 0; i<row;i++) {
				System.out.print("*");
				
				
			}
			System.out.print("\n");
			row--;
		}while(row != 0);
	}
}