package MapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("test0001", "a1111");
		
		map.put("test0002", "a2222");
		map.put("test0003", "a3333");
		for(String k: map.keySet()) {
			System.out.println("id: " + k +" , password: " + map.get(k));
		}
	}

}
