package mainpackage;

import java.util.HashMap;
import java.util.Map;

public class MyCollectionHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Jyotsna");
		map.put(3, "Akhilesh");
		map.put(5, "Pack");
		System.out.println(map.get(1));
		for(Map.Entry m:map.entrySet()){
			System.out.println("key:" + m.getKey() + ",value:"+ m.getValue());
		}
		map.put(1, "Jyotsna - The Billionaire");
		System.err.println(map.get(1));
		map.remove(5);
		for(Map.Entry m:map.entrySet()){
			System.out.println("key:" + m.getKey() + ",value:"+ m.getValue());
		}
		

	}

}
