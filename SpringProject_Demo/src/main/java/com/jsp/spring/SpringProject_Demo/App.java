package com.jsp.spring.SpringProject_Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		// 1st way to get object
		Student s = bf.getBean(Student.class);
		s.learn();

		// when we start creating the same object for the second time it will not create
		// the object instead it takes from the BeanFactory container
		// 2st way to get object
		Student s2 = (Student) bf.getBean("student-bean");
		s2.learn();
	}
}
//
///**
// * output -> object get created
// *  learning spring framework 
// *  learning spring framework
// */


