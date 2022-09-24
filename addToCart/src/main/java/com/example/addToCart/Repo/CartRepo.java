package com.example.addToCart.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addToCart.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Long> {
	
}
