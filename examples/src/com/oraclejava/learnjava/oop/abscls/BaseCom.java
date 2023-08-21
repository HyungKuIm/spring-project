package com.oraclejava.learnjava.oop.abscls;

public abstract class BaseCom {
	public BaseCom() {
		System.out.println("추상클래스 베이스 컴퓨터입니다.");
	}
	
	public void boot() {
		System.out.println("컴퓨터를 부팅합니다.");
	}
	
	public void shutdown() {
		System.out.println("컴퓨터를 종료합니다.");
	}
}
