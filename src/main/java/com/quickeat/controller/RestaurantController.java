package com.quickeat.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickeat.model.RegisterRestaurant;
import com.quickeat.model.ResponseData;
import com.quickeat.services.RestaurantServices;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	public static final Logger LOGGER = LoggerFactory.getLogger(RestaurantController.class);
	
	@Autowired
	RestaurantServices service;

	@PostMapping("/register")
	@ApiOperation(value="Register Restaurant in the database", notes="${RestaurantController.register.notes}")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Restaurant registered successfully!!"),
			@ApiResponse(code=401, message="You are authorize to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you are trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you are trying to reach not found")
	})
	public ResponseEntity<ResponseData> createOrUpdateRestaurant(@RequestBody RegisterRestaurant entity) {
		LOGGER.info("Entering into the register controller method ");
			service.registerRestaurant(entity);
			ResponseData response = new ResponseData();
			response.setRespCode(HttpStatus.OK.toString());
			response.setRespMessage("Data save successfully!!");
			response.setTimestamp(LocalDateTime.now());
			return new ResponseEntity<ResponseData>(response, new HttpHeaders(), HttpStatus.OK);
				
	}
	
	@GetMapping("/getAllRestaurant")
	@ApiOperation(value="Get All Restaurant from database", notes="${RestaurantController.getAll.notes}")
	public ResponseEntity<List<RegisterRestaurant>> getAllRestaurant(){
		LOGGER.info("Entering into getAllEntity method");
		
		List<RegisterRestaurant> list = service.getAllRestaurant();
		
		return new ResponseEntity<List<RegisterRestaurant>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value="Get Restaurant by Id", notes="${RestaurantController.getRestaurantById.notes}")
	public ResponseEntity<RegisterRestaurant> getRestaurantById(@PathVariable("id") Integer Id){
		RegisterRestaurant entity = new RegisterRestaurant();
		entity = service.getRestaurantById(Id);
		return new ResponseEntity<RegisterRestaurant>(entity, new HttpHeaders(), HttpStatus.OK);
	}
	
}
