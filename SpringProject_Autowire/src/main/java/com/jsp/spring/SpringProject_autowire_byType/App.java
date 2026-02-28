package com.jsp.spring.SpringProject_autowire_byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.jsp.spring.SpringProject_autowire_byName.Student;

public class App {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("autowire_byType.xml"));
		Student student= bf.getBean(Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
	}
}
