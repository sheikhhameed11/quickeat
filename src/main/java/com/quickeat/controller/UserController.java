package com.quickeat.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickeat.model.ItemCategories;
import com.quickeat.model.Users;
import com.quickeat.model.ResponseData;
import com.quickeat.services.UserServices;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
public class UserController {

	public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserServices service;

	@PostMapping("/register")
	@ApiOperation(value="Register user in the database", notes="${UserController.register.notes}")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="User registered successfully!!"),
			@ApiResponse(code=401, message="You are authorize to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you are trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you are trying to reach not found")
	})
	public ResponseEntity<ResponseData> createOrUpdateUser(@RequestBody Users entity) {
		LOGGER.info("Entering into the register controller method ");
			service.register(entity);
			ResponseData response = new ResponseData();
			response.setRespCode(HttpStatus.OK.toString());
			response.setRespMessage("Data save successfully!!");
			response.setTimestamp(LocalDateTime.now());
			return new ResponseEntity<ResponseData>(response, new HttpHeaders(), HttpStatus.OK);
				
	}

	
	@GetMapping("/getAll")
	@ApiOperation(value="Get All users from database", notes="${UserController.getAll.notes}")
	public ResponseEntity<List<Users>> getAllEntity(){
		LOGGER.info("Entering into getAllEntity method");
		
		List<Users> list = service.getAllEntity();
		
		return new ResponseEntity<List<Users>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/{id}")
	@ApiOperation(value="Get User by Id", notes="${UserController.getUserById.notes}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") Integer Id){
		Users entity = new Users();
		entity = service.getUserById(Id);
		return new ResponseEntity<Users>(entity, new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{Id}")
	@ApiOperation(value="Delete User By Id", notes="${UserController.deleteById.notes}")
	public ResponseEntity<ResponseData> deleteUserById(@PathVariable("id") Integer Id){
		Users entity = new Users();
		 service.deleteById(Id);
		 ResponseData response = new ResponseData();
		 response.setRespCode(HttpStatus.OK.toString());
		 response.setRespMessage("Data deleted Successfully of userId: "+Id);
		 response.setTimestamp(LocalDateTime.now());
		 return new ResponseEntity<ResponseData>(response, new HttpHeaders(), HttpStatus.OK);
	}
}
