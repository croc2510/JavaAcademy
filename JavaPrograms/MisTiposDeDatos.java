public class MisTiposDeDatos{
	int edad;
	short peso;
	String nombre;
	boolean esVip;
	boolean TieneCredencial;
	long valorLong;
	
	public static void main(String[] args){
		MisTiposDeDatos ejemplo = new MisTiposDeDatos();
		System.out.println(ejemplo.peso);
		System.out.println(ejemplo.edad);
		System.out.println(ejemplo.nombre);
		System.out.println(ejemplo.esVip);
		System.out.println(ejemplo.valorLong);
		System.out.println(ejemplo.TieneCredencial);
		}
}