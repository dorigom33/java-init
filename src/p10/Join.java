package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.print("USERNAME : ");
		String uiName = scan.nextLine();

		try {
			Connection con = DBCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_ID,UI_PWD,UI_NAME)\r\n" + "VALUES('" + uiId + "','" + uiPwd + "','"
					+ uiName + "')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 개수 : " + resultCnt);
			System.out.println("환영합니다! " + uiName + " 님");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
