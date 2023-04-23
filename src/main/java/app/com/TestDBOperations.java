package app.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.com.dao.DBConnection;

public class TestDBOperations {

	static Connection con=null;
	public static void main(String[] args) {
    
		selectQuery("TEST_TABLE");
	
	}
	
	public static void selectQuery(String tableName) {

		try {
			DBConnection dbConnection = new DBConnection();
			con= dbConnection.getConnection();
			String query="SELECT * FROM "+tableName+"";
			System.out.println(query);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.println("ROW : "+rs.getString("ID"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
