package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {
	
	public List<Map<String, String>> getclassInfoList(Map<String,String> param) {
		ClassInfoRepository clRepo = new ClassInfoRepository();
		return clRepo.getClassInfoList(param);
	}

}
