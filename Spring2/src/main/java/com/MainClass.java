package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee e1=(Employee)context.getBean("e1");
		Employee e2=(Employee)context.getBean("e2");
		Employee e3=(Employee)context.getBean("e3");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
