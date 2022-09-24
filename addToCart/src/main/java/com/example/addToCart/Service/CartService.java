package com.example.addToCart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Repo.CartRepo;


@Service
public class CartService {

	
	@Autowired
	private CartRepo cartRepo;
	
	public void addItemToCartService(Cart cart) {
		
		this.cartRepo.save(cart);
		
	}
	
	public void removeItemFromCartService(Cart cart) {
		
		this.cartRepo.delete(cart);
	}
	
	public List<Cart> showAllCart(){
		return this.cartRepo.findAll();
	}
}
