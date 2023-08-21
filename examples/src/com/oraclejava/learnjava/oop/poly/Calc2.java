package com.oraclejava.learnjava.oop.poly;

public class Calc2 implements Calc {
	
	private int prop1;
	private double prop2;
	
	
	
	public Calc2(int prop1, double prop2) {
		super();
		this.prop1 = prop1;
		this.prop2 = prop2;
	}



	@Override
	public double calculate() {
		return prop1 * prop2;
	}

}
