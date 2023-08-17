package com.oraclejava.learnjava.start;

public class PrimitiveTypes {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		charType();
		minMax();
		casting();
		literals();
		var();
	}
	
	private static void charType() {
		System.out.println("\nType char:");
		
		char x1 = '\u0032';
		System.out.println(x1);
		
		char x2 = '2';
		System.out.println(x2);
		
		x2 = 65;
		System.out.println(x2);
		
		char y1 = '\u0041';
		System.out.println(y1);
		
		char y2 = 'A';
		System.out.println(y2);
		
		y2 = 50;
		System.out.println(y2);
		
		System.out.println(x1 + x2);
		System.out.println(x1 + y1);
		
	}
	
	private static void minMax() {
		System.out.println("\nMin and max:");
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println((int) Character.MIN_VALUE);
		System.out.println((int) Character.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
	
	private static void casting() {
		float f = 42.3f;
		float d = 42.3F;
		double a = 42.3f;
		double b = 42.3F;
		float x = (float)42.3d;
		float y = (float)42.3D;
	}
	
	private static void literals() {
		byte b = 42;
		short s = 42;
		int i = 42;
		long l = 42, l1 = 42l, l2 = 42L;
		
		System.out.println("\nLiterals:");
		System.out.println(Integer.toString(i ,2));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(0b101010);
		
		System.out.println(Integer.toString(i, 8));
		System.out.println(Integer.toOctalString(i));
		System.out.println(052);
		
		System.out.println(Integer.toString(i, 10));
		System.out.println(Integer.toString(i));
		System.out.println(42);
		
		System.out.println(Integer.toString(i, 16));
		System.out.println(Integer.toHexString(i));
		System.out.println(0x2a);
		
		// 자바 7 부터 사용가능
		i = 354_263_654;
		System.out.println(i);
		
		float f = 54_436.98f;
		System.out.println(f);
		
		l = 55_763_948L;
		System.out.println(l);
		
		System.out.println("\nEscape sequences:");
		System.out.println("\"");
		System.out.println('\'');
		System.out.println('\\');
		
		System.out.println("The back\bspace");
		System.out.println("The horizontal\ttab");
		System.out.println("The line\nfeed");
		System.out.println("The form\ffeed");
		System.out.println("The carriage\rreturn");
		
	}
	
	private static void var() {
		var x = 1;
		System.out.println(x);
	}

}
