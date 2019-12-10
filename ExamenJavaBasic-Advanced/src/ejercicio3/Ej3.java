package ejercicio3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word;
		
		do {
			System.out.println("Introduce cadena menor a 50 caracteres y mayor a 2");
			word = scan.nextLine();
		}while(word.length() > 50);
		word = word.toLowerCase().replaceAll("\\W", "");
		StringBuilder sb = new StringBuilder(word);
		String reverse = new String(sb.reverse());
		
		if(word.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
	}
}
