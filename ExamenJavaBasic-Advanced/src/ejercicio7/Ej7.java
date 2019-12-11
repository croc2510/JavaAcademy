package ejercicio7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej7 {
	public static Map<String, String> Mapa = new HashMap<String, String>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";

		Mapa.put("a1234", "Steve Jobs");
		Mapa.put("a1235", "Scott McNealy");
		Mapa.put("a1236", "Jeff Bezos");
		Mapa.put("a1237", "Larry Ellison");
		Mapa.put("a1237", "Bill Gates");
		// System.out.println(Mapa.values());

		System.out.println("Llave a buscar: ");
		str = scan.nextLine();
		if (Mapa.containsKey(str)) {
			obtenerPersonaje(str);
		} else {
			System.out.println("No se encontró registro con ese valor");
		}
	}

	public static void obtenerPersonaje(String llave) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("C:\\Users\\curso\\Desktop\\Mapa.txt");

			writer.println(llave + " " + Mapa.get(llave));
			writer.close();
			System.out.println("New File Created!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(Mapa.get(llave));
	}
}
