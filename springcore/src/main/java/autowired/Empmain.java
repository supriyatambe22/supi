package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empmain {

	public static void main(String[] args) {

ApplicationContext ac=new ClassPathXmlApplicationContext("autowired/reference.xml");
Employee1 e=ac.getBean(Employee1.class,"employee1");
System.out.println(e);


	}

}
