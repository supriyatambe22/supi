package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Employee;

public class Studmain {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle/Stud.xml");
		
		Student student=(Student)context.getBean("stud");
		context.registerShutdownHook();
		System.out.println(student.getName());
		System.out.println(student.getStudId());
		System.out.println(student.getDept());
	}

}
