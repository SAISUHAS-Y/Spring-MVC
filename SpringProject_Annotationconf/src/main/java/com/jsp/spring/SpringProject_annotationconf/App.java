package com.jsp.spring.SpringProject_annotationconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfg.class);
		Product product=ac.getBean(Product.class);
		System.out.println(product);
		
		Product product1=(Product) ac.getBean("product");
		System.out.println(product1);
		
		Product product2=(Product) ac.getBean("product");
		System.out.println(product2);
	}
}
