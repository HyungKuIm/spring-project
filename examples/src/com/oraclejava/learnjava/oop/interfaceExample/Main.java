package com.oraclejava.learnjava.oop.interfaceExample;

public class Main {

	public static void main(String[] args) {
		System.out.println("interface example입니다...");
		
		SomeInterface si = new SomeClass();
		si.method1();
		System.out.println(si.method2(10));
		System.out.println(si.method3());
		System.out.println(si.method4());
	}

}
