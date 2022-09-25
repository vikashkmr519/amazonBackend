package com.example.addToCart.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.Product;
import com.example.addToCart.Repo.CartRepo;


@Service
public class CartService {

	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private ProductDetailsProxy productDetailsProxy;
	
	public void addItemToCartService(Cart cart) {
		
		this.cartRepo.save(cart);
		
	}
	
	public void removeItemFromCartService(Cart cart) {
		
		this.cartRepo.delete(cart);
	}
	
	public List<Cart> showAllCart(){
		return this.cartRepo.findAll();
	}
	
	public List<Product> displayProductsInCart(UUID userId) {
		//List<Cart> allCart = this.showAllCart();
//		List<Product> products= new ArrayList<>(); 
//
//		for(Cart cart : allCart) {
//			Product product = this.productDetailsProxy.getProductByProductId(cart.getUserId());
//			products.add(product);
//			
//		}
//		
//		return products;
		return  null;
	}
	
	
}
