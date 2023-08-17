package com.oraclejava.learnjava.oop;

public class Final {
	public static void main(String[] args) {
		finalVariables();
	}
	
	private static void finalVariables() {
		final String s;
		s = "abc";
		System.out.println(s);
//		s = "def";
	}
}
