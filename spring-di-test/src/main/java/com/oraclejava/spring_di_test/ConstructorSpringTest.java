package com.oraclejava.spring_di_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorSpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SimpleSpringTest.xml");
		SampleBean bean = context.getBean("sampleBean", SampleBean.class);
		System.out.println(bean.getFirstBean());
		System.out.println(bean.getSecondBean());

	}

}
