package com.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empmain {

	public static void main(String[] args) {

ApplicationContext ac=new ClassPathXmlApplicationContext("com/ref/reference.xml");
Employee1 e=(Employee1) ac.getBean("employee1");
System.out.println(e.getEmpid());
System.out.println(e.getName());
System.out.println(e.getAddress());


	}

}
