package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constmain {

	public static void main(String[] args) {

ApplicationContext ac= new ClassPathXmlApplicationContext("com/constructor/constructorconfig.xml");
	Laptop l= (Laptop) ac.getBean("laptop");
	System.out.println(l);
	}

}
