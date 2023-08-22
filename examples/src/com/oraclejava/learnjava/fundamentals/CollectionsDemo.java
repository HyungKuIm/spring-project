package com.oraclejava.learnjava.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("s1");
		list1.add("s1");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		System.out.println(list2);
		
		Set<String> set1 = new HashSet<>();
		set1.add("s1");
		set1.add("s1");
		set1.add("s2");
		
		System.out.println(set1);
		
		Iterable<String> list = List.of("s1", "s2", "s3");
		
		for (String e: list) {
			System.out.println(e);
		}
		
		Map<Integer, String> map = Map.of(1, "s1", 2, "s2", 3, "s3");
		
		for (Integer key: map.keySet()) {
			System.out.println(key + ", " + map.get(key));
		}
		
		for (Map.Entry e: map.entrySet()) {
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
	}

}
