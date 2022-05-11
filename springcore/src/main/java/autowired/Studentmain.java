package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentmain {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("autowired/Stud.xml"); 
Student student=context.getBean(Student.class,"student");
System.out.println(student);
	}

}
