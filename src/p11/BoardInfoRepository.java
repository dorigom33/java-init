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

public class BoardInfoRepository {
	public List<Map<String,String>> getBoardInfoList(){
		List<Map<String,String>> boardInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO ";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> boardInfo = new HashMap<>();
				boardInfo.put("biNum", rs.getString("BI_NUM"));
				boardInfo.put("biTitle", rs.getString("BI_TITLE"));
				boardInfo.put("biContent", rs.getString("BI_CONTENT"));
				boardInfo.put("biWriter", rs.getString("BI_WRITER"));
				boardInfo.put("biCredat", rs.getString("BI_CREDAT"));
				boardInfo.put("biCnt", rs.getString("BI_CNT"));
				boardInfoList.add(boardInfo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return boardInfoList;
	}
	
	public int updateBoardInfo(Map<String, String> boardInfo){
		Connection con = DBCon.getCon();
		Statement stmt;
		try {
			stmt = con.createStatement();
			if(boardInfo != null) {
				String sql = "UPDATE BOARD_INFO SET ";
				if(boardInfo.get("biTitle") !=null) {
					sql += " BI_TITLE='" + boardInfo.get("biTitle") + "',";
				}
				if(boardInfo.get("biContent") !=null) {
					sql += " BI_CONTENT='" + boardInfo.get("biContent") + "',";
				}
				if(boardInfo.get("biWriter") !=null) {
					sql += " BI_WRITER='" + boardInfo.get("biWriter") + "',";
				}
				if(boardInfo.get("biCnt") !=null) {
					sql += " BI_CNT='" + boardInfo.get("biCnt") + "',";
				}
				sql = sql.substring(0, sql.length()-1);
				sql += " WHERE BI_NUM=" + boardInfo.get("biNum");
				return stmt.executeUpdate(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		
		List<Map<String,String>> boardInfoList = biRepo.getBoardInfoList();
		for(Map<String,String> boardInfo : boardInfoList) {
			System.out.println(boardInfo);
			
		}
		Map<String,String> boardInfo = new HashMap<>();
		boardInfo.put("biNum", "1");
		boardInfo.put("biCnt", "1");
		int result = biRepo.updateBoardInfo(boardInfo);
		System.out.println("업데이트 결과 : " + result);
		
		
	}
}
