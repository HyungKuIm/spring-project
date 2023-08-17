package com.oraclejava.spring_di_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringSetterInjection.xml");
		SampleBean bean = context.getBean("sampleBean", SampleBean.class);
		System.out.println(bean.getFirstBean());
		System.out.println(bean.getSecondBean());

	}

}
