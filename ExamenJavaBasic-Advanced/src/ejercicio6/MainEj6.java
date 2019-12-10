package ejercicio6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainEj6 {
public static List<State> estados = new ArrayList<>();
	public static void main(String[] args) throws SQLException, IOException {

		Connection connection = MyDBData.getConnection();
		try {
			System.out.println(connection.getMetaData().getDatabaseProductName());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "Select * from state";
		Statement stmt = null;

		stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			State stt = new State();
			stt.setState_id(rs.getString("State_id"));
			stt.setState(rs.getString("Description"));
			stt.setShipping_zone_id(rs.getString("shipping_zone_id"));
			
			System.out.println(stt.toString());
			estados.add(stt);

			
		}
		PrintWriter writer = null;
		try {
			/* Create a new file with UTF-8 encoding */
			writer = new PrintWriter("C:\\Users\\curso\\Desktop\\Estados.txt");

			/* Write content to file */
			writer.println(estados.toString());
			writer.close();			
			System.out.println("New File Created!");			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}

}
