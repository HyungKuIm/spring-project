package com.oraclejava.learnjava.oop.override;

public interface Child extends Parent {
	
	String FIELD2 = "field2-Child";
	String FIELD3 = "field3-Child";
	
	static void method1(String msg) {
		System.out.println(msg + "\t자식 메소드 method1()");
	}
	
	static void method3() {
		System.out.println("자식 메소드 method3()");
	}

}
