package com.oraclejava.learnjava.start;

public class Operators {

	public static void main(String[] args) {
		integerDivision();
		incrementDecrement();
		equality();
		relational();
		logical();
		assignment();

	}
	
	private static void integerDivision() {
		System.out.println("\nDivision of integral values:");
		int x = 5;
		System.out.println(x % 2);
		
		System.out.println(x / 2);
		
		System.out.println(x / 2.);
		
		System.out.println((1. * x) / 2);
		
		System.out.println(((float)x) / 2);
		System.out.println(((double)x) / 2);
	}
	
	private static void incrementDecrement() {
		System.out.println("\nIncrement/decrement operators:");
		int i = 2;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(--i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
	}
	
	private static void equality() {
		System.out.println("\nEquality operators");
		int i1 = 1;
		int i2 = 2;
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);
		System.out.println(i1 == (i2 - 1));
		System.out.println(i1 != (i2 - 1));
	}
	
	private static void relational() {
		System.out.println("\nRelational operators");
		int i1 = 1;
		int i2 = 2;
		System.out.println(i1 > i2);
		System.out.println(i1 >= i2);
		System.out.println(i1 < i2);
		System.out.println(i1 <= i2);
		float f = 1.2f;
		System.out.println(i1 < f);
	}


	private static void logical() {
		System.out.println("\nLogical operators");
		boolean b = true;
		System.out.println(!b);
		
		boolean c= true;
		boolean d = false;
		
		System.out.println(c && b);
		System.out.println(c || b);
		
		System.out.println(c && d);
		System.out.println(c || d);
		
		int h = 1;
		System.out.println(h > 3 & h++ < 3);
		System.out.println(h);
		
		System.out.println(h > 3 && h++ < 3);
		System.out.println(h);
	}
	
	private static void assignment() {
		System.out.println("\nAssignment operators");
		float a = 1f;
		a += 2;
		System.out.println(a);
		a-= 1;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 2;
		System.out.println(a);
		a %= 2;
		System.out.println(a);
	}
	

}
