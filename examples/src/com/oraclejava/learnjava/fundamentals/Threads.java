package com.oraclejava.learnjava.fundamentals;

public class Threads {

	public static void main(String[] args) {
		
		runExtendedThreads();
	}
	
	private static void runExtendedThreads() {
		MyThread thr1 = new MyThread("One");
		thr1.start();
		MyThread thr2 = new MyThread("Two");
		thr2.start();
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		MyThread thr3 = new MyThread("Three");
//		thr3.setParameter("exit");
		thr1.setParameter("exit");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thr2.setParameter("exit");
		
	}
	
	

}
