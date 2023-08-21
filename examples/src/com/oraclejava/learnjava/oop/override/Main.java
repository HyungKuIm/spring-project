package com.oraclejava.learnjava.oop.override;

public class Main {

	public static void main(String[] args) {
		System.out.println("\nChild 연습중...");
		System.out.println(Child.FIELD1);
		System.out.println(Child.FIELD2);
		System.out.println(Child.FIELD3);
		Child.method1("강호동");   // 자식의 메소드가 불러짐 --> 오버라이드라고 함...
		//Child.method2();  // 자식 메소드엔 없음
		Child.method3();
		
		
		System.out.println("\nParent 연습중...");
		System.out.println(Parent.FIELD1);
		System.out.println(Parent.FIELD2);
//		System.out.println(Parent.FIELD3);  // 당연히 FIELD3은 자식에만 존재한다.
		Parent.method1("이승기");
		Parent.method2("이정후");
//		Parent.method3();  // 당연히, 자식의 method3에 접근할 수 없음
		
	}

}
