package com.example.productDetailService.Service;

import java.util.ArrayList;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productDetailService.Entity.Product;
import com.example.productDetailService.Repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public ArrayList<Product> findAllProducts(){
		return (ArrayList<Product>) productRepo.findAll();
	}
	
	public Product findProductByProductId(UUID productId) {
		return  productRepo.findProductByProductId(productId);
	}
}
