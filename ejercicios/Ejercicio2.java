
public class Ejercicio2 {
	public static void main(String[] args) {
		/*Given two strings, a and b, return the result of 
		 * putting them together in the order abba, e.g. 
				"Hi" and "Bye" returns "HiByeByeHi".*/
		
		String a = "Hi";
		String b = "Bye";
		System.out.println(a+b+b+a);
		
		String c = "Yo";
		String d = "Alice";
		System.out.println(c+d+d+c);
		
		String e = "What";
		String f = "Up";
		System.out.println(e+f+f+e);
	}
}
