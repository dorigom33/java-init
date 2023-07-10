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
	
	public int insertClassInfo(Map<String,String>classInfo) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.insertClassInfo(classInfo);
	}
	
	public int deleteClassInfo(Map<String, String> classInfo) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.deleteClassInfo(classInfo);
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
		
		param.put("clName", "소프트웨어설계");
		param.put("clDesc", "1813");
		int insertResult = clController.insertClassInfo(param);
		System.out.println("실행결과 : " + insertResult); 
		
		param.put("clNum", "2");
		int deleteResult = clController.deleteClassInfo(param);
		System.out.println("실행결과 : " + deleteResult);
	}

}
