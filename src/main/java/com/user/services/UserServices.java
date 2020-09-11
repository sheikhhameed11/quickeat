package com.user.services;

import java.util.List;

import com.user.model.RegisterEntity;

public interface UserServices {

	RegisterEntity register(RegisterEntity entity);

	List<RegisterEntity> getAllEntity();

	RegisterEntity getUserById(Integer id);

}
