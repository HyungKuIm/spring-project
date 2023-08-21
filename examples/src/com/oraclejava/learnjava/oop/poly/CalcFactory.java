package com.oraclejava.learnjava.oop.poly;

import java.util.Scanner;

public class CalcFactory {
	public static Calc getCalculator() {
		System.out.println("번호를 선택하세요(1 or 2):");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:
			return new Calc1();
		case 2:
			int p1 = 98234;
			double p2 = 24.0;
			return new Calc2(p1, p2);
		default:
			System.out.println("알수없는 값입니다");
			return new Calc1();
		}
	}
}
