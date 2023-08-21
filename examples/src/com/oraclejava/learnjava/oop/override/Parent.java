package com.oraclejava.learnjava.oop.override;

public interface Parent {
	String FIELD1 = "field1-Parent";
	String FIELD2 = "field2-Parent";
	
	static void method1(String msg) {
		System.out.println(msg + "\t부모 메소드 method1()");
	}
	
	static void method2(String msg) {
		System.out.println(msg + "\t부모 메소드 method2()");
	}
}
