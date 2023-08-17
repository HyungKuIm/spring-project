package com.oraclejava.spring_di_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SimpleSpringAnnotationTest.xml");
		
		SampleAnnotationBean bean = context.getBean("sampleAnnotationBean", SampleAnnotationBean.class);
		System.out.println(bean.getFirstBean());
		System.out.println(bean.getSecondBean());

	}

}
