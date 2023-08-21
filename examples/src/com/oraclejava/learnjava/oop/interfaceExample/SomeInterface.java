package com.oraclejava.learnjava.oop.interfaceExample;

public interface SomeInterface {
	void method1();
	String method2(int i);
	
	default int method3() {
		return 100;
	}
	
	default int method4() {
		return getNumber() + 22;
	}
	
	private int getNumber() {
		return 42;
	}
}
