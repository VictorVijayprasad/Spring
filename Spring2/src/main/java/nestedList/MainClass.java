package nestedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import carEngine.Car;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("teamconfignested.xml");
		Team t=(Team)context.getBean("t");
		System.out.println(t);
	}
}
