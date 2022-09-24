package com.example.productDetailService.Repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productDetailService.Entity.Product;

@Repository
public interface ProductRepo  extends MongoRepository<Product, BigInteger>{
//
//	Product save(Product product);
//	
//	ArrayList<Product> findAll();
	
	Product findProductByProductId(UUID productId);
}
