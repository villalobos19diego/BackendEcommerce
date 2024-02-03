package com.villalobos19.service;

import com.villalobos19.exception.ProductException;
import com.villalobos19.modal.Cart;
import com.villalobos19.modal.User;
import com.villalobos19.request.AddItemRequest;

public interface CartService {


	// crea el carrito de compras
	
	public Cart createCart(User user);


	// agrega un uevo item al carrito de compras
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;


	//  busca  el carrito por le usuario
	public Cart findUserCart(Long userId);

}
