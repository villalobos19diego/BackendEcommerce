package com.villalobos19.service;

import com.villalobos19.exception.CartItemException;
import com.villalobos19.exception.UserException;
import com.villalobos19.modal.Cart;
import com.villalobos19.modal.CartItem;
import com.villalobos19.modal.Product;

public interface CartItemService {

	//crea un nuevo item
	
	public CartItem createCartItem(CartItem cartItem);


	//actualiza el item
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	 // verifica si el item existe
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	// elimina el item
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	// busca el item por id
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
