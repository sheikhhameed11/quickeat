package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.UserEntity;
import com.user.services.UserServices;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class RegisterController {

	@Autowired
	UserServices service;

	@ApiOperation(value="Register user in the database", response=ResponseEntity.class)
	@ApiResponses(value = {
			@ApiResponse(code=200, message="User registered successfully!!"),
			@ApiResponse(code=401, message="You are authorize to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you are trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you are trying to reach not found")
	})
	@PostMapping("/register")
	public ResponseEntity createOrUpdate(@RequestBody UserEntity entity){
		
		
		return null;
		
	}
}
