package com.oraclejava.learnjava.fundamentals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InputOutputStream {

	public static void main(String[] args) {
		byteArrayInputStream1();
		fileInputStream1();
		objectInputOutputStream();
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
	
	private static void fileInputStream1() {
		System.out.println("\nfileInputStream1:");
		String file = "d:/down/hello.txt";
		try(FileInputStream fis = new FileInputStream(file)) {
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print(((char)data) + " ");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private static void objectInputOutputStream() {
		System.out.println("\nobjectInputOutputStream:");
		String filename = "phone.bin";
		try {
			File file = new File(filename);
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try (ObjectOutputStream objectOutputStream = 
				new ObjectOutputStream(new FileOutputStream(filename))) {
			Phone phone = new Phone();
			objectOutputStream.writeObject(phone);
			System.out.println("객체 파일 생성");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try (ObjectInputStream objectInputStream = 
				new ObjectInputStream(new FileInputStream(filename))) {
			Phone phone = (Phone) objectInputStream.readObject();
			System.out.println("번호:" + phone.getNum());
			System.out.println("이름:" + phone.getName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
				
		
	}

}
