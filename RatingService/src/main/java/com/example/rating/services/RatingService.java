package com.example.rating.services;

import java.util.List;

import com.example.rating.entities.Rating;

public interface RatingService {
    //create
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getRatings();
	
	//get all by userid
	List<Rating> getRatingByUserId(String userId);
	
	//het all by hotel 
	List<Rating> getRatingByHotelId(String hotelId);
	
}
