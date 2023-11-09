package com.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("byconstructor.xml");
		Categories categories=(Categories)context.getBean("categories");
		System.out.println(categories);
		
	}

}
