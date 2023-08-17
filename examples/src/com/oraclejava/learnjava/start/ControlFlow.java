package com.oraclejava.learnjava.start;

public class ControlFlow {

	public static void main(String[] args) {
		// 이클립스 콘솔창에서 한글이 깨질경우
		// https://carj.kr/entry/%EC%9E%90%EB%B0%94-%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4-%EC%BD%98%EC%86%94-%EC%B0%BD-%ED%95%9C%EA%B8%80-%EA%B9%A8%EC%A7%90-%EB%AC%B8%EC%A0%9C-%ED%95%9C%EB%B2%88%EC%97%90-%ED%95%B4%EA%B2%B0#:~:text=%EB%A9%94%EB%89%B4%EC%9D%98%20Window%20-%3E%20Preferences%20%EC%8B%A4%ED%96%89%20General%20-%3E%20Content,%EB%88%8C%EB%9F%AC%EC%84%9C%20%EB%8B%AB%EA%B3%A0%20%EC%8B%A4%ED%96%89%20%ED%95%B4%EB%B3%B4%EB%A9%B4%20%EC%BD%98%EC%86%94%EC%B0%BD%EC%97%90%20%ED%95%9C%EA%B8%80%EC%9D%B4%20%EC%9E%98%20%EB%82%98%EC%98%A8%EB%8B%A4.
		selection();
		iteration();

	}

	
	private static void selection() {
		System.out.println("\nSelection statements:");
		int x = 1, y = 2;
		
		if (x > y) {
			System.out.println("x는 y보다 크다");
		}
		
		if (x > y) {
			System.out.println("x는 y보다 크다");
		} else {
			System.out.println("x는 y보다 크지 않다");
		}
		
		if (x > y) {
			System.out.println("x는 y보다 크다");
		} else if (x == y) {
			System.out.println("x와 y는 같다");
		} else {
			System.out.println("x는 y보다 작다");
		}
		
		switch (x) {
		case 5:
			System.out.println("x는 5");
			break;
		case 7:
			System.out.println("x는 7");
			break;
		case 12:
			System.out.println("x는 12");
			break;
		case 50:
			System.out.println("x는 50");
			break;
		default:
			System.out.println("아무것도 아님...");
		}
		
		
		// 이하는 자바 12부터 사용가능
		// https://qiita.com/dhirabayashi/items/2999b04a369379f41675 
		switchStatement(1);
		switchStatement(2);
		switchStatement(5);
		
		switchExpression1(0);
		switchExpression1(1);
		switchExpression1(2);
	}
	
	private static void switchStatement(int x) {
		switch (x) {
		case 1, 3 -> System.out.print("1 or 3");
		case 4 -> System.out.print("4");
		case 5, 6 -> System.out.print("5 or 6");
		default -> System.out.print("Not 1,3,4,5,6");
		}
		System.out.println(": " + x);
	}
	
	private static void switchExpression1(int i) {
		boolean b = switch(i) {
		case 0, 1 -> false;
		case 2 -> true;
		default -> false;
		};
		System.out.println(b);
	}
	
	
	private static void iteration() {
		System.out.println("\nIteration statements:");
		
		int n = 0;
		while (n < 5) {
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
		
		n = 0;
		do {
			System.out.print(n + " ");
			n++;
		} while(n < 5);
		System.out.println();
		
		for (int i=0; i<3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}


}
