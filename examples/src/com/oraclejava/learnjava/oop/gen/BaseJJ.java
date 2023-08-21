package com.oraclejava.learnjava.oop.gen;

// 전자기기 베이스
public abstract class BaseJJ<T> {

	private T t;
	
	public BaseJJ() {
		System.out.println("베이스 전자기기입니다.");
	}
	
	public void setName(T t) {
		this.t = t;
	}
	
	public T getName() {
		return t;
	}
	
	public void showName() {
		System.out.println(t.toString());
	}
}
