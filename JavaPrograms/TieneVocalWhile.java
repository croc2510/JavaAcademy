public class TieneVocalWhile{
	public static void main(String[] args){
		String cadena = args[0];
		int i = 0;
		int longitud = cadena.length();
		do{
			
				if(cadena.charAt(i) == 'A' || cadena.charAt(i) == 'a'||
				   cadena.charAt(i) == 'E' || cadena.charAt(i) == 'e'||
				   cadena.charAt(i) == 'I' || cadena.charAt(i) == 'i'||
				   cadena.charAt(i) == 'O' || cadena.charAt(i) == 'o'||
				   cadena.charAt(i) == 'U' || cadena.charAt(i) == 'u'){
					System.out.print("Tiene vocal");
					break;
				}
			i++;
		}while(i < longitud);
		}
	}
