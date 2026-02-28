package com.jsp.spring.SpringProject_application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		Product product=ap.getBean(Product.class);
		System.out.println(product);
	}
}
