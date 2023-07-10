package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClassInfoController {
	public List<Map<String, String>> getClassInfoList(Map<String,String> param){
		ClassInfoService clService = new ClassInfoService();
		return clService.getclassInfoList(param);
	}
	public static void main(String[] args) {
		ClassInfoController clController = new ClassInfoController();
		Map<String, String> param = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어를 입력 : ");
		String sel = scan.nextLine();
		param.put("clName",sel);
		List<Map<String,String>> classInfoList = clController.getClassInfoList(param);
		System.out.println("번호\t이름\t설명");
		for(Map<String, String> classInfo : classInfoList) {
			System.out.println(classInfo.get("clNum") + "\t" + classInfo.get("clName") + "\t" + classInfo.get("clDesc"));
		}
	}

}
