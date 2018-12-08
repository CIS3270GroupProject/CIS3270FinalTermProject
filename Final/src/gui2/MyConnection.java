package gui2;

import java.sql.*;

public class MyConnection {
		public static Connection getConnection() {
			
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false", "root", "Tweezer92!!");
//				Statement statement = conn.createStatement();
			}
			catch (Exception exc){
//				exc.printStackTrace();
				System.out.println("Connection failed");
			}
			return conn;
		}
	}

