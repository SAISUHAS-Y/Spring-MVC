package com.jsp.spring.SpringProject_DependecnyEnjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
public class App 
{
	public static void main( String[] args )
	{
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.constructor.xml"));
		Student student= bf.getBean(Student.class);
		System.out.println(student);
		//System.out.println(student.getAddress());
	}
}
