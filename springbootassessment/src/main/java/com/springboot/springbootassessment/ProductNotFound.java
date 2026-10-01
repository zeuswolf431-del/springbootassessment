package com.springboot.springbootassessment;

public class ProductNotFound extends RuntimeException {
	 public ProductNotFound(String msg)
	  {
		  super(msg);
	  }
}
