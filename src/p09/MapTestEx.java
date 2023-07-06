package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestEx {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("이름", "이상수");
		m.put("나이", "26");
		m.put("지역", "수원");
		m.put("성별", "남");

		Map<String, String> m1 = new HashMap<>();
		m1.put("이름", "이하늘");
		m1.put("나이", "26");
		m1.put("지역", "수원");
		m1.put("성별", "여");

		Map<String, String> m2 = new HashMap<>();
		m2.put("이름", "김영우");
		m2.put("나이", "25");
		m2.put("지역", "화성");
		m2.put("성별", "남");

		Map<String, String> m3 = new HashMap<>();
		m3.put("이름", "심은하");
		m3.put("나이", "27");
		m3.put("지역", "서울");
		m3.put("성별", "여");

		Map<String, String> m4 = new HashMap<>();
		m4.put("이름", "이정수");
		m4.put("나이", "23");
		m4.put("지역", "서울");
		m4.put("성별", "남");

		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		for(Map<String,String> map : mapList) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " ; " + map.get(key) + ",");
			}
			System.out.println();
		}
	}

}
