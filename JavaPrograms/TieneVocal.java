public class TieneVocal{
	public static void main(String[] args){
		String cadena = args[0];
		for(int i=0; i <= cadena.length(); i++){
			if(cadena.charAt(i) == 'O' || cadena.charAt(i) == 'o'){
			System.out.print("Tiene vocal");
			break;
			}
		}
	}
}