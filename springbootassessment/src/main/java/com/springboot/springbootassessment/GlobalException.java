package com.springboot.springbootassessment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;



public class GlobalException {

	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<String> handler(ProductNotFound ex)
	{
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(ex.getMessage());
	}
}
