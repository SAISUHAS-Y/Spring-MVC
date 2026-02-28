package com.jsp.spring.SpringProject_annotation_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Product product = ac.getBean(Product.class);
		System.out.println(product);
		Product product1 = (Product) ac.getBean("product");
		System.out.println(product1);
	}
}
