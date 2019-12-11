package ejercicio9Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio6.MyDBData;
import ejercicio6.State;
import ejercicio9.Mydb;;

public class City implements StateImp {

	private String city_id;
	private String description;
	private String state_id;

	public City() {

	}

	public City(String description, String state_id) {
		this.city_id = city_id;
		this.description = description;
		this.state_id = state_id;
	}

	public City(String city_id, String description, String state_id) {
		this.city_id = city_id;
		this.description = description;
		this.state_id = state_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState_id() {
		return state_id;
	}

	public void setState_id(String state_id) {
		this.state_id = state_id;
	}

	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", description=" + description + ", state_id=" + state_id + "]";
	}

	@Override
	public int addCity(City city) {
		Mydb db = new Mydb();
		Connection connection = db.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "insert into city(description,state_id) values (?,?)";
			ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, city.getDescription());
			ps.setString(2, city.getState_id());
			System.out.println(ps);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs != null && rs.next()) {
				System.out.println("Generated city_id: " + rs.getInt(1));
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public City getCity(int id) {
		City estados = new City();
		Connection connection = MyDBData.getConnection();
		String sql = "Select * from city where city_id=" + id;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				City stt = new City();
				stt.setCity_id(rs.getString("city_id"));
				stt.setDescription(rs.getString("Description"));
				stt.setState_id(rs.getString("State_id"));

				System.out.println(stt.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return estados;

	}

	@Override
	public List<City> getAllCities() throws SQLException {
		List<City> estados = new ArrayList<>();
		Connection connection = MyDBData.getConnection();
		String sql = "Select * from city";
		Statement stmt = null;

		stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			City stt = new City();
			stt.setCity_id(rs.getString("city_id"));
			stt.setDescription(rs.getString("Description"));
			stt.setState_id(rs.getString("State_id"));

			System.out.println(stt.toString());
			estados.add(stt);

		}
		return estados;
	}

	@Override
	public boolean updateCity(City city) {
		boolean registro = false;
		Mydb db = new Mydb();
		Connection connection = db.getConnection();
		PreparedStatement ps = null;
		try {
			String query = "update city set description=?,state_id=? where city_id=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, city.getDescription());
			ps.setString(2, city.getState_id());
			ps.setString(3, city.getCity_id());
			System.out.println(ps);
			ps.executeUpdate();
			registro = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return registro;
	}

	@Override
	public void deleteCity(int id) {
		Mydb db = new Mydb();
		Connection connection = db.getConnection();
		PreparedStatement ps = null;
		try {
			String query = "delete from city where city_id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
