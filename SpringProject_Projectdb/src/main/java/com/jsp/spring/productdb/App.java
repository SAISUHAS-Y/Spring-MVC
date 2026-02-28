package com.jsp.spring.productdb;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.productdb.controller.ProductController;

public class App {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductController pc=ac.getBean(ProductController.class);
		System.out.println("enter the choice");
		int choice=sc.nextInt();

		switch (choice) {
		case 1:
			pc.addProduct();
			break;

		case 2:
			pc.findProductById();
			break;

		case 3:
			pc.updateProduct();
			break;

		case 4:
			pc.deleteProduct();
			break;

		case 5:
			pc.findAllProduct();
			break;

		default:
			System.out.println("other than the choice");
			break;
		}
	}
}
