package com.ust.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		Map<Integer, String> numbersMap = new HashMap<>();
		numbersMap.put(23, "Twenty three");
		numbersMap.put(12, "Twelve");
		
		for(Integer key: numbersMap.keySet()){
			System.out.println(key);
			System.out.println(numbersMap.get(key));
		}

	}

}
