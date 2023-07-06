package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestEx2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("이름", "이상해꽃");
		m.put("타입", "풀,독");
		m.put("특성", "엽록소");
		m.put("특수기", "하드플랜트");
		m.put("도감번호", "3");
		Map<String, String> m1 = new HashMap<>();
		m1.put("이름", "블레이범");
		m1.put("타입", "불");
		m1.put("특성", "타오르는불꽃");
		m1.put("특수기", "불사르기");
		m1.put("도감번호", "157");
		Map<String, String> m2 = new HashMap<>();
		m2.put("이름", "나무킹");
		m2.put("타입", "풀");
		m2.put("특성", "곡예");
		m2.put("특수기", "리프블레이드");
		m2.put("도감번호", "254");
		Map<String, String> m3 = new HashMap<>();
		m3.put("이름", "초염몽");
		m3.put("타입", "불,격투");
		m3.put("특성", "철주먹");
		m3.put("특수기", "인파이트");
		m3.put("도감번호", "392");
		Map<String, String> m4 = new HashMap<>();
		m4.put("이름", "대검귀");
		m4.put("타입", "물");
		m4.put("특성", "조가비갑옷");
		m4.put("특수기", "비검천충파");
		m4.put("도감번호", "503");
		Map<String, String> m5 = new HashMap<>();
		m5.put("이름", "개굴닌자");
		m5.put("타입", "물,악");
		m5.put("특성", "변환자재");
		m5.put("특수기", "물수리검");
		m5.put("도감번호", "658");
		Map<String, String> m6 = new HashMap<>();
		m6.put("이름", "모크나이퍼");
		m6.put("타입", "풀,비행");
		m6.put("특성", "원격");
		m6.put("특수기", "그림자꿰매기");
		m6.put("도감번호", "725");
		Map<String, String> m7 = new HashMap<>();
		m7.put("이름", "에이스번");
		m7.put("타입", "불");
		m7.put("특성", "리베로");
		m7.put("특수기", "화염볼");
		m7.put("도감번호", "815");
		Map<String, String> m8 = new HashMap<>();
		m8.put("이름", "마스카나");
		m8.put("타입", "풀,악");
		m8.put("특성", "변환자재");
		m8.put("특수기", "트릭플라워");
		m8.put("도감번호", "908");

		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		mapList.add(m5);
		mapList.add(m6);
		mapList.add(m7);
		mapList.add(m8);
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
