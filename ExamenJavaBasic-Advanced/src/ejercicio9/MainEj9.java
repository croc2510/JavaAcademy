package ejercicio9;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio6.State;
import ejercicio9Entities.City;

public class MainEj9 {
	public static List<State> estados = new ArrayList<>();

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		int oper = 0, b;
		// controlador para funciones
		City control = new City();
		String aux;
		String aux2;
		String y;
		do {
			System.out.println(
					"Datos de tabla - Funciones\n1) Agregar Ciudad\n2) Listar todas las ciudades\n3) Modificar una ciudad\n4)Eliminar una ciudad\n Introduzca 0 para salir");
			oper = scan.nextInt();
			switch (oper) {
			case 1:
				// crea una ciudad y la agrega a la tabla City
				System.out.println("Nombre de la ciudad: ");
				scan.nextLine();
				aux = scan.nextLine();

				System.out.println("Id del estado: ");
				aux2 = scan.nextLine();

				City ciudades = new City(aux, aux2);
				int x = control.addCity(ciudades);
				control.getCity(x);
				break;

			case 2:
				// Imprime todas las ciudades
				System.out.println(control.getAllCities());
				break;
			case 3:
				// Modifica un registro y luego lo imprime
				System.out.println("Descripcion: ");
				scan.nextLine();
				aux = scan.nextLine();
				System.out.println("state_id: ");
				aux2 = scan.nextLine();
				System.out.println("Elegir el city_id a modificar: ");
				y = scan.nextLine();
				City add = new City(y, aux, aux2);
				int a = Integer.parseInt(y);
				control.updateCity(add);
				control.getCity(a);
				break;

			case 4:
				System.out.println("Introducir el ID de la ciudad a eliminar: ");
				b = scan.nextInt();
				control.deleteCity(b);
				break;
			}
		} while (oper != 0);
	}

}
