package com.example.addToCart.Service;

import java.util.UUID;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.addToCart.Entity.Product;



@FeignClient(name="product-metadata", url="localhost:8082")
public interface ProductDetailsProxy {
	
	@GetMapping("/amazon/products/search/{productId}")
	public Product getProductByProductId(@PathVariable UUID productId);
	

}
