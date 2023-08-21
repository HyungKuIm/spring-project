package com.oraclejava.learnjava.oop.gen;

public class SamsungCom extends BaseJJ<Computer> {

	public void boot() {
		Computer com = new Computer();
		this.setName(com);
		System.out.println("이름: " + this.getName());
		this.showName();
	}
}
