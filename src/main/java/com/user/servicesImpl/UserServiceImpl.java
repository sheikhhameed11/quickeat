package com.user.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.exception.RecordNotFoundException;
import com.user.model.RegisterEntity;
import com.user.repository.RegisterRepository;
import com.user.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	RegisterRepository repository;

	@Override
	public RegisterEntity register(RegisterEntity entity) {
		LOGGER.info("Entering into register method");
		entity = repository.save(entity);
		return entity;
	}

	@Override
	public List<RegisterEntity> getAllEntity() {
		List<RegisterEntity> entryList = repository.findAll();
		if (entryList.size() > 0) {
			return entryList;
		} else {
			return new ArrayList<RegisterEntity>();
		}

	}

	@Override
	public RegisterEntity getUserById(Integer id) {
		RegisterEntity entity = new RegisterEntity();
		Optional<RegisterEntity> registery = repository.findById(id);
		if (registery.isPresent()) {

			entity = registery.get();
			return entity;
		} else {
			throw new RecordNotFoundException(null);
		}
	}

}
