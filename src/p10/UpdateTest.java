package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		
		try {
			Connection con = DBCon.getCon();
			String sql = "UPDATE USER_INFO SET UI_NAME='영우' WHERE UI_NUM=3";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 개수 : " + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
