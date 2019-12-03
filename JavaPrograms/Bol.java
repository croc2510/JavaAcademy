public class Bol{
	public static void main(String[] args){
		boolean vip=false;
		boolean cred=true;
		int edad = 18;
		short peso = 70;
		String nombre = "Jose";
		boolean puede_votar = false;
		System.out.println("Nombre: "+nombre + "\nEdad: "+edad +"\npeso: " +peso +"\nCredencial " +cred );
		if(edad >= 18 && cred == true){
		puede_votar = true;
		System.out.println("Puede votar "+puede_votar);
		}
		else {
		System.out.println("no puede votar "+puede_votar);
		}
	
	}
} 