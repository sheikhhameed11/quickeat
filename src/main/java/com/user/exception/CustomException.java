package com.user.exception;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.user.model.ResponseData;

@ControllerAdvice
public class CustomException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Logger LOGGER = LoggerFactory.getLogger(CustomException.class);
	
	@ExceptionHandler(value= {RecordNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public final ResponseEntity<Object> handleNotFoundException(final RecordNotFoundException ex){
		LOGGER.info("Entering into the handleInvocationTargetException method");
		ResponseData error = new ResponseData();
		error.setRespCode(HttpStatus.NOT_FOUND.toString());
		error.setRespMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<Object>(error,new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value= {Exception.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public final ResponseEntity<Object> handleInvocationTargetException(Exception ex){
		LOGGER.info("Entering into the handleInvocationTargetException method");
		ResponseData error = new ResponseData();
		error.setRespCode(HttpStatus.BAD_REQUEST.toString());
		error.setRespMessage(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());

		return new ResponseEntity<Object>(error,new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	
}
