package mainpackage;

import java.util.HashMap;
import java.util.Map;

public class MyCollectionSets {
	public static void main(String[] args){
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"Jyotsna");
		map.put(4,"Luna");
		map.put(56,"Kiana");
		System.err.println(map.get(1));
		for(Map.Entry m:map.entrySet()){
			System.err.println("key:"+ m.getKey() + ",value:"+ m.getValue());
		}
		map.put(1,"Jyotsna Singh");
		System.err.println(map.get(1));
		map.remove(1);
	}
}