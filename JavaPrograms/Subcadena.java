public class Subcadena{
	public static void main(String[] args){
		String cadena = args[0];
		String subcadena = "";
		
		if(cadena.length() < 2){
			System.out.println(cadena);
			}
		else{
			subcadena = cadena.substring(0,2);
			System.out.println(subcadena);
			}
	}
}