package com.oraclejava.learnjava.fundamentals;

import java.io.ByteArrayInputStream;

public class InputOutputStream {

	public static void main(String[] args) {
		byteArrayInputStream1();
	}
	
	private static void byteArrayInputStream1() {
		System.out.println("\nbyteArrayInputStream1:");
		byte[] buffer = new byte[] {80,85,83,65,78};
		try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
			// 1. 편의상 주석처리함
//			int data = bais.read();
//			while (data != -1) {
//				System.out.print((char)data + " ");
//				data = bais.read();
//			}
			// 2. 자바에서는 이런 방식을 더 많이 씀
			int data;
			while ((data = bais.read()) != -1) {
				System.out.print((char)data + " ");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
