package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestEx3 {
	
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("이름", "이상수");
		m.put("키보드", "fc900r");
		m.put("마우스", "g102");
		m.put("전화기", "s22");
		m.put("Rank", "5");
		Map<String,String> m1 = new HashMap<>();
		m1.put("이름", "이정현");
		m1.put("키보드", "huntsman v3");
		m1.put("마우스", "g502");
		m1.put("전화기", "fold2");
		m1.put("Rank", "2");
		Map<String,String> m2 = new HashMap<>();
		m2.put("이름", "이정수");
		m2.put("키보드", "k70");
		m2.put("마우스", "roccat");
		m2.put("전화기", "note9");
		m2.put("Rank", "1");
		Map<String,String> m3 = new HashMap<>();
		m3.put("이름", "심원섭");
		m3.put("키보드", "huntsman tkl");
		m3.put("마우스", "deathAdderv2");
		m3.put("전화기", "s10e");
		m3.put("Rank", "7");
		Map<String,String> m4 = new HashMap<>();
		m4.put("이름", "이하늘");
		m4.put("키보드", "fc750r");
		m4.put("마우스", "mx master 3s");
		m4.put("전화기", "iphone 14pro");
		m4.put("Rank", "1");
		
        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(m);
        mapList.add(m1);
        mapList.add(m2);
        mapList.add(m3);
        mapList.add(m4);
		for (int i = 0; i < mapList.size(); i++) {
			Map<String, String> map = mapList.get(i);
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key) + ",");
			}
			System.out.println();
        }
		
	}

}
