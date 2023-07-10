package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class UserInfoRepository {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		List<Map<String, String>> userInfoList = new ArrayList<>();

		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO ";
			if (param != null) {
				if (param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'";
				}

			}
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfoList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;

	}

}
