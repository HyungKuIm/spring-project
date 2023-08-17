package com.oraclejava.learnjava.oop.finalp;

public class A {
	private final String s1 = "abc";
	private final String s2;
	
	public A() {
//		this.s1 = "def";  // error
		this.s2 = "xyz";
	}

	@Override
	public String toString() {
		return "A [s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	
}
