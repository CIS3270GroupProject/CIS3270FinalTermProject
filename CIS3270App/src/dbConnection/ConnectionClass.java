
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionClass {

	public static Connection dbConnect {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:orcl", "ABCDE", "ABCDE");
			
		}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
	}

}
