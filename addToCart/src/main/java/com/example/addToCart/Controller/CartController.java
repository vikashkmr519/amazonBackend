package com.example.addToCart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Service.CartService;


@RestController
@RequestMapping("/amazon/addToCart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		this.cartService.addItemToCartService(cart);
		}

	@DeleteMapping("/remove")
	public void removeFromCart(@RequestBody Cart cart) {
		this.cartService.removeItemFromCartService(cart);
	}

	
	@GetMapping("/show")
	public List<Cart> showAllCart(){
	return this.cartService.showAllCart();	
	}
}
