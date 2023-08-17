package com.oraclejava.spring_di_test;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SampleAnnotationBean {
	
	private FirstBean firstBean;
	private SecondBean secondBean;

	@Autowired
	public SampleAnnotationBean(FirstBean firstBean, SecondBean secondBean) {
		this.firstBean = firstBean;
		this.secondBean = secondBean;
	}

}
