package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ej8 {
	public static void main(String[] args) {

		List<String> paises = new ArrayList<>();
		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");

		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");

		List<String> paises3 = new ArrayList<>();
		paises3.addAll(paises);
		paises3.addAll(paises2);
		Collections.sort(paises3);
		Iterator iter = paises3.iterator();
		int i = 1;
		while (iter.hasNext()) {
			System.out.println(i+" " +iter.next());
		i++;
		}
	}
}
