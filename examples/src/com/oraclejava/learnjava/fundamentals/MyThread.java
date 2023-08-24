package com.oraclejava.learnjava.fundamentals;

public class MyThread extends Thread {

	private String parameter;
	
	public MyThread(String parameter) {
		this.parameter = parameter;
	}
	
	public void run() {
		while(!"exit".equals(parameter)) {
			System.out.println("Hello World " + this.getName() + " (" + this.parameter + ")");
		}
		System.out.println("스레드 " + this.getName() + " 이 종료됨");
	}
	
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
}
