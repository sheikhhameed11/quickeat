package com.quickeat.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickeat.model.ItemCategories;
import com.quickeat.services.ItemServices;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/item")
public class ItemController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	ItemServices service;
	
	@GetMapping("/getItemCategories")
	@ApiOperation(value="Get All food Item Category from database", notes="${ItemController.getItemCategory.notes}")
	public ResponseEntity<List<ItemCategories>> getItemCategory(){
		LOGGER.info("Entering into getItemCategory method");
		
		List<ItemCategories> list = service.getItemCategories();
		
		return new ResponseEntity<List<ItemCategories>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}
