package ejercicio9Entities;

import java.sql.SQLException;
import java.util.List;

public interface StateImp {

	public int addCity(City city);

	public City getCity(int id);

	public List<City> getAllCities() throws SQLException;

	public boolean updateCity(City city);

	public void deleteCity(int id);

}
