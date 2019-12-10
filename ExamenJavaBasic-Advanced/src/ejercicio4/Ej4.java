package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	List<Integer> j = new ArrayList<>();
	List<Integer> k = new ArrayList<>();
	List<Integer> arr3 = new ArrayList<>();
	
	for(int i = 0; i < 3; i++) {
		System.out.println("Numero "+(i+1) + " Del primer arreglo");
		n = scan.nextInt();
		j.add(n);
	}
	
	for(int i = 0; i < 3; i++) {
		System.out.println("Numero "+(i+1) + " Del segundo arreglo");
		n = scan.nextInt();
		k.add(n);
	}
	
	arr3.add(j.get(1));
	arr3.add(k.get(1));
	System.out.println("Primer arreglo " +j);
	System.out.println("Segundo arreglo " +k);
	System.out.println("Tercer arreglo " +arr3);
}
}
