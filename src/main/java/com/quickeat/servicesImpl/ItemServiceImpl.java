package com.quickeat.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.quickeat.model.ItemCategories;
import com.quickeat.repository.ItemCategoriesRepository;
import com.quickeat.services.ItemServices;

public class ItemServiceImpl implements ItemServices{

	public static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);

	@Autowired
	ItemCategoriesRepository items;
	
	
	@Override
	public List<ItemCategories> getItemCategories() {
		List<ItemCategories> categoryList = items.findAll();
		if(categoryList.size() >  0)
		return categoryList;
		else
			return new ArrayList<ItemCategories>();
	}

	
}
