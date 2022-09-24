package com.example.productDetailService.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productDetailService.Entity.Product;
import com.example.productDetailService.Service.ProductService;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		product.setProductId(UUID.randomUUID());
		return service.saveProduct(product);
	}
	
	
	@GetMapping("/getAllProducts")
	public ArrayList<Product> getAllProducts() {
		return service.findAllProducts();
	}
	
	
	@GetMapping("/search/{productId}")
	public Product saveData(@PathVariable UUID productId) {
		return service.findProductByProductId(productId);
	}
	

}
