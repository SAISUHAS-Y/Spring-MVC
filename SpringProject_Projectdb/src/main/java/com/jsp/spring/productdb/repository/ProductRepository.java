package com.jsp.spring.productdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jsp.spring.productdb.entity.Product;

@Repository
public class ProductRepository {

	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
	
	public void addProduct(Product product) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(product);
		
		et.commit();
		em.close();
	}

	public Product findProductById(int key) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Product product=em.find(Product.class,key);
		et.commit();
		em.close();
		
		return product;
	}

	public void updateProduct(Product product) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.merge(product);
		
		et.commit();
		em.close();		
	}
	
	public void deleteProduct(int key) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Product product=em.find(Product.class,key);
		em.remove(product);
		
		et.commit();
		em.close();		
	}
	
	public List<Product> findAllProduct(){
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();

		Query query=em.createQuery("FROM Product");
		List product=query.getResultList();
		et.commit();
		em.close();
			
		return product;
	}
}