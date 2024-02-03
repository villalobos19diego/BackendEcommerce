package com.villalobos19.service;

import java.util.List;

import com.villalobos19.exception.ProductException;
import com.villalobos19.modal.Review;
import com.villalobos19.modal.User;
import com.villalobos19.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
