package com.oraclejava.learnjava.oop.interfaceExample;

public class SomeClass implements SomeInterface {

	@Override
	public void method1() {
		System.out.println("안녕하세요");
	}

	@Override
	public String method2(int i) {
		return "제가 좋아하는 숫자: " + i;
	}

}
