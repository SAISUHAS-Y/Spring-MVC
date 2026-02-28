package com.jsp.spring.SpringProject_application_context;

public class Product{
	private int productId;
	private String productName;

	public Product() {
		System.out.println("object get created");
	}

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
}
