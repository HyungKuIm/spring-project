package com.oraclejava.learnjava.fundamentals;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a = 0;
			int num = 10 / a;
			System.out.println("num = " + num);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			throw new RuntimeException("0으로 나눴습니다...");
		} finally {
			System.out.println("에러 유무와 상관없이 최종 처리");
		}
		
//		System.out.println("에러가 발생되지 않았을 경우(정상처리)에만 실행됨~");
		
	}

}
