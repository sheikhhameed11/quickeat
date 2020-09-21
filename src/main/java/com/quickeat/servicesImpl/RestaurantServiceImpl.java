package com.quickeat.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickeat.exception.RecordNotFoundException;
import com.quickeat.model.RegisterRestaurant;
import com.quickeat.model.Users;
import com.quickeat.repository.RestaurantRepo;
import com.quickeat.services.RestaurantServices;

@Service
public class RestaurantServiceImpl implements RestaurantServices{

	public static final Logger LOGGER = LoggerFactory.getLogger(RestaurantServiceImpl.class);
	@Autowired
	RestaurantRepo restaurantRepo;

	
	@Override
	public void registerRestaurant(RegisterRestaurant entity) {
		LOGGER.debug("Entering into registerRestaurant method");
		restaurantRepo.save(entity);
		
	}

	@Override
	public List<RegisterRestaurant> getAllRestaurant() {
		List<RegisterRestaurant> restaurantList = restaurantRepo.findAll();
		if(restaurantList.size()> 0) {
			return restaurantList;
		}else {
			return new ArrayList<RegisterRestaurant>();	
		}
		
	}

	@Override
	public RegisterRestaurant getRestaurantById(Integer id) {
		String regId=String.valueOf(id);
		RegisterRestaurant entity = new RegisterRestaurant();
		
		Optional<RegisterRestaurant> registry = restaurantRepo.findById(id);
		if (registry.isPresent()) {

			entity = registry.get();
			return entity;
		} else {
			throw new RecordNotFoundException(regId);
		}
	}
}
