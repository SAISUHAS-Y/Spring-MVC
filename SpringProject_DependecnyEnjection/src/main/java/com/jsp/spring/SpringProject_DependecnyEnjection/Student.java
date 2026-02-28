package com.jsp.spring.SpringProject_DependecnyEnjection;

public class Student {

	//in terms of setter injection
	//	private Address address;
	//
	//	public Address getAddress() {
	//		return address;
	//	}
	//
	//	public void setAddress(Address address) {
	//		this.address = address;
	//	}
	
	//in terms of constructor injection
	private int studentId;
	private String studentName;
	
	private Address address;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, Address address) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
}
