package com.capge.Day7;

import java.util.TreeMap;
import java.util.HashMap;
public class MyMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();

		map.put(123, "sima");
		map.put(124, "rama");
		map.put(125, "neha");
		map.put(126, "suhana");
        map.put(100, null);
		
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
         map3.put(111,"renu");
		// using key set
		System.out.println(map.keySet());

		// using valueSet
		System.out.println(map.values());

		// using entrySet
		System.out.println(map.entrySet());

		
		//map.size();
		//map.clear();
		System.out.println(map.get(123));
		System.out.println(map.isEmpty());
		
		
		
	}

}
