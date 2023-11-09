package com.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("byname.xml");
		
		Categories categories=(Categories) context.getBean("categories");
		System.out.println(categories);
		
	}

}
