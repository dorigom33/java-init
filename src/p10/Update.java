package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 : ");
		String uiId = scan.nextLine();
		System.out.println("변경할 이름을 입력해주세요 : ");
		String uiName = scan.nextLine();
		System.out.println("변경할 비밀번호를 입력해주세요 : ");
		String uiPwd = scan.nextLine();
		
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
