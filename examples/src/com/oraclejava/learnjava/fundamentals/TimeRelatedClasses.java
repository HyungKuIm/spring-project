package com.oraclejava.learnjava.fundamentals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TimeRelatedClasses {

	public static void main(String[] args) {
		System.out.println("===현재시간 구하기===");
		System.out.println(new Date());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//특정한 날짜
		LocalDate theday = LocalDate.parse("2023-02-23");
		LocalDate theday2 = LocalDate.of(2023, 2, 23);
		
		System.out.println(theday);
		System.out.println(theday2);
		
		//요일
		System.out.println("theday = " + theday.getDayOfWeek());
		//윤년여부
		System.out.println("윤년인지 = " + theday.isLeapYear());
		
	}

}
