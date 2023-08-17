package com.oraclejava.spring_di_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SampleBean {
	
	private FirstBean firstBean;
	private SecondBean secondBean;
	
}
