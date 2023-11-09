package com.autodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autodetect.xml");
		Categories categories=(Categories) context.getBean("categories");
		System.out.println(categories);
	}

}


//<bean id="categories" class="com.autodetect.Categories" autowire="autodetect">
//<property name="name" value="Akki"></property>
//</bean>
//
//<bean id="policy" class="com.autodetect.Policy">
//<property name="planName" value="TermPlan"></property>
//<property name="planAmount" value="10000"></property>
//
//</bean>