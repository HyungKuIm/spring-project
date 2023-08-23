package com.oraclejava.learnjava.fundamentals;

import java.io.Serializable;

// 객체를 스트림화 할 경우, 클래스에 Serializable을 붙인다.
public class Phone implements Serializable{

	private int num = 100;
	private String name = "아이폰";
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
