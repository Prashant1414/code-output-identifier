package app.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	Connection con = null;

	public Connection getConnection() {
		if (con == null) {

			String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
			String username = "TEST"; 
			String password = "TEST";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(url, username, password);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
