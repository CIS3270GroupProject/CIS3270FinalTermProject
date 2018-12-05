package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Tweezer92!!");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from flight");
			while (rs.next()) {
				System.out.println(rs.getString("arrival_city"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
