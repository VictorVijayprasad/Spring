package carEngine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carconfig.xml");
		Car c=(Car)context.getBean("c");
		System.out.println(c);	
	}
}
