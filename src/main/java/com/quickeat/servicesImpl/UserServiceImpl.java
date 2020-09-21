package com.quickeat.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickeat.exception.RecordNotFoundException;
import com.quickeat.model.ItemCategories;
import com.quickeat.model.Users;
import com.quickeat.model.RegisterRestaurant;
import com.quickeat.repository.ItemCategoriesRepository;
import com.quickeat.repository.RegisterRepository;
import com.quickeat.repository.RestaurantRepo;
import com.quickeat.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	RegisterRepository repository;
	

	@Override
	public void register(Users entity) {
		LOGGER.info("Entering into register method");
		repository.save(entity);
	}

	@Override
	public List<Users> getAllEntity() {
		List<Users> entryList = repository.findAll();
		if (entryList.size() > 0) {
			return entryList;
		} else {
			return new ArrayList<Users>();
		}

	}

	@Override
	public Users getUserById(Integer id) {
		String regId=String.valueOf(id);
		Users entity = new Users();
		
		Optional<Users> registry = repository.findById(id);
		if (registry.isPresent()) {

			entity = registry.get();
			return entity;
		} else {
			throw new RecordNotFoundException(regId);
		}
	}

	@Override
	public void deleteById(Integer id) {
		String regId=String.valueOf(id);
//		RegisterEntity entity = new RegisterEntity();
		Optional<Users> registry = repository.findById(id);
		if(registry.isPresent()) {
			repository.delete(registry.get());
		}else {
			throw new RecordNotFoundException(regId);
		}
		
	}

}
