

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

	private static final String url ="jdbc:mysql://localhost:3306/db";
	private final static String usname ="root";
	private final static String password="system";
	
	public static Connection getconnect() throws SQLException {
		return DriverManager.getConnection(url, usname, password);
	}

}
