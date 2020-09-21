package com.quickeat.services;

import java.util.List;

import com.quickeat.model.ItemCategories;
import com.quickeat.model.Users;
import com.quickeat.model.RegisterRestaurant;

public interface UserServices {

	 void register(Users entity);

	List<Users> getAllEntity();

	Users getUserById(Integer id);

	void deleteById(Integer id);




}
