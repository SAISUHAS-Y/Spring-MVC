package com.jsp.spring.productdb.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring.productdb.entity.Product;
import com.jsp.spring.productdb.repository.ProductRepository;

@Service
public class ProductService {

	Scanner sc = new Scanner(System.in);

	@Autowired
	private ProductRepository productRepository;

	public void addProduct() {
		Product product = new Product();
		System.out.println("Enter ProductID:");
		product.setProductId(sc.nextInt());

		System.out.println("Enter ProductName:");
		product.setProductName(sc.next());

		System.out.println("Enter ProductBrand:");
		product.setProductBrand(sc.next());

		System.out.println("Enter ProductPrice:");
		product.setProductPrice(sc.nextInt());

		productRepository.addProduct(product);

		System.out.println("Data Inserted Successfully!!");

	}

	public void findProductById() {

		System.out.println("Enter ProuctId");
		Product product = productRepository.findProductById(sc.nextInt());

		System.out.println(product);
	}

	public void updateProduct() {
		System.out.println("Enter ProuctId");
		Product product = productRepository.findProductById(sc.nextInt());
		System.out.println("Enter ProuctPrice");
		product.setProductPrice(sc.nextInt());

		productRepository.updateProduct(product);

		System.out.println("Updated ");
	}

	public void deleteProduct() {
		System.out.println("Enter ProuctId");

		productRepository.deleteProduct(sc.nextInt());

		System.out.println("Delete ");
	}

	public void findAllProduct() {

		List<Product> products=	productRepository.findAllProduct();
		for (Product product : products) {
			System.out.println(product);
		}
	}
}