package com.productapp.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
public class Main {
	public static void main(String[] args) {

	
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("productapp.xml");
		

		ProductService productService = applicationContext.getBean("productService", ProductService.class);
		
		/*
		 * List<Product> productList=productService.getAll();
		 * 
		 * productList.forEach(p-> System.out.println(p));
		 */
		//Product product=new Product("pen", new BigDecimal(33), true);
		
		//productService.addProduct(product);
		
		Product product=productService.getById(1);
		System.out.println(product);
//		product.setAvailable(false);
//		productService.updateProduct(2, product);
	}

}
