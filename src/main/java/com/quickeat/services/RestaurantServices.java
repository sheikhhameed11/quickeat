package com.quickeat.services;

import java.util.List;

import com.quickeat.model.RegisterRestaurant;

public interface RestaurantServices {

	void registerRestaurant(RegisterRestaurant entity);

	List<RegisterRestaurant> getAllRestaurant();

	RegisterRestaurant getRestaurantById(Integer id);

}
