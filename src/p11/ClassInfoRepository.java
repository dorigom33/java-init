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

public class ClassInfoRepository {
	public List<Map<String, String>> getClassInfoList(Map<String,String> param){
		List<Map<String,String>> classInfoList = new ArrayList<>();
		
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM CLASS_INFO ";
			if(param !=null) {
				if(param.get("clName") != null) {
					sql += " WHERE Ci_NAME LIKE '%" + param.get("clName") + "%'";
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> classInfo = new HashMap<>();
				classInfo.put("clNum", rs.getString("CI_NUM"));
				classInfo.put("clName", rs.getString("CI_NAME"));
				classInfo.put("clDesc", rs.getString("CI_DESC"));
				classInfoList.add(classInfo);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return classInfoList;
	}

}
