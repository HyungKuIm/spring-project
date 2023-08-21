package com.oraclejava.learnjava.oop.updowncasting;

public class Main {

	public static void main(String[] args) {
		
		// 업다운 캐스팅은 클래스 - 클래스 관계에서만 사용하는 것이 좋음
		System.out.println("Child(Y)객체 생성");
		Y y = new Y();
		System.out.println(y.getName());
		
		System.out.println("Child(Y)객체를 Parent(X)타입으로 업캐스팅");
		X x = y;
		System.out.println(x.getName());
		
		System.out.println("Child(Y)객체를 Parent(X)타입으로 업캐스팅하여 Child(Y)객체로 다운캐스팅");
		
		Y y2 = (Y)x;
		System.out.println(y2.getName());
	}

}
