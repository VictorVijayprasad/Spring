package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("constEmp.xml");
		
		Employee s1 = (Employee) context.getBean("s1");
		Employee s2 = (Employee) context.getBean("s2");
		Employee s3 = (Employee) context.getBean("s3");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
