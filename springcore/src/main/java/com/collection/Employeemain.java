package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("com/collection/collectionconfig.xml");
Employee employee=(Employee)context.getBean("emp");
System.out.println(employee.getEmployeeId());
System.out.println(employee.getEmailId());
System.out.println(employee.getJob());
System.out.println(employee.getPhoneno());
	}

}
