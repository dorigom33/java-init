package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}

	public int insertUserInfo(Map<String, String> userinfo) {
		return 0;
	}

	public int deleteUserInfo(Map<String, String> userInfo) {
		return 0;
	}

	public static void main(String[] args) {
		UserInfoController uiController = new UserInfoController();
		Map<String, String> param = new HashMap<>();
		param.put("uiName", "우");
		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for (Map<String, String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") + "\t" + userInfo.get("uiName") + "\t" + userInfo.get("uiId") + "\t" + userInfo.get("uiPwd"));
		}
	}
}