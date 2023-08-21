package com.oraclejava.learnjava.oop.poly;

public class Main {

	public static void main(String[] args) {
		Calc calc = CalcFactory.getCalculator();
		System.out.println(calc.calculate());
	}

}
