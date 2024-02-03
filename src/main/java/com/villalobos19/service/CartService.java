package com.villalobos19.service;

import com.villalobos19.exception.ProductException;
import com.villalobos19.modal.Cart;
import com.villalobos19.modal.User;
import com.villalobos19.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
