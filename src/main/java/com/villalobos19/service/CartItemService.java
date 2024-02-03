package com.villalobos19.service;

import com.villalobos19.exception.CartItemException;
import com.villalobos19.exception.UserException;
import com.villalobos19.modal.Cart;
import com.villalobos19.modal.CartItem;
import com.villalobos19.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
