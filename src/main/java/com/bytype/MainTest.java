package com.bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest {
	public static void main(String[] args) {
	
		Resource resource=new ClassPathResource("byname.xml");
		@SuppressWarnings("deprecation")
		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Categories categories=(Categories) beanFactory.getBean("c");
		System.out.println(categories);
		
	}
	

}
