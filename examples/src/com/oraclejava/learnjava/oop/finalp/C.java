package com.oraclejava.learnjava.oop.finalp;

public class C {
	private final static String s1 = "abc";
	private final static String s2;
	static {
//		s1 = "xyz";  // error
		s2 = "abc";
	}

	public void show() {
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
