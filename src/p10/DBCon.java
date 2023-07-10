package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/KD";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";
	
	static {
		try {
			Class.forName(DRIVER_CLASS);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}
	
	public static Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
