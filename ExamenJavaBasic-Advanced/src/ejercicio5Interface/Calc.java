package ejercicio5Interface;

public class Calc implements Operaciones {


	@Override
	public int suma(int n, int n2) {
		int suma;
		suma = n+n2;
		return suma;
	}

	@Override
	public int resta(int n, int n2) {
		int resta;
		resta = n-n2;
		return resta;
	}

	@Override
	public int multiplicacion(int n, int n2) {
		int mult;
		mult = n*n2;
		return mult;
	}

	@Override
	public double division(double n, double n2) {
		double div;
		div = n/n2;
		return div;
	}


}
