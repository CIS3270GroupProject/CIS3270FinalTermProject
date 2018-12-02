package dbConnection;

import java.sql.*;

public class Driver {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights", "root", "Tweezer92!");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from flights");
			while(rs.next()) {
				System.out.println(rs.getString("flight_number") + " leaving from " + ("departure_city") + "and arriving"
									+ ("arrival_city") );
			}
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		
	}

}
