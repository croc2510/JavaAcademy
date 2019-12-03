import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primer Numero: ");
		int a = scanner.nextInt();
		System.out.println("Segundo Numero: ");
		int b = scanner.nextInt();
		System.out.println("Suma: "+a+" + "+b +" = " +(a+b) + "\nResta: "+a+" - "+b +" = " + (a-b) + "\nMultiplicacion: "+a+" x "+b +" = "+(a*b) +("\nDivision: ")+a+" / "+b +" = " + (a/b));
	}
}