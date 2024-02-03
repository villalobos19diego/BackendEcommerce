package com.villalobos19.service;

import java.util.List;

import com.villalobos19.exception.ProductException;
import com.villalobos19.modal.Rating;
import com.villalobos19.modal.User;
import com.villalobos19.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
