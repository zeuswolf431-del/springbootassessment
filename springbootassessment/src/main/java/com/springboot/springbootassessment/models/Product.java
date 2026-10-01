package com.springboot.springbootassessment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	 @Id
      private Long id;
      private String productitem;
      private double prdouctprice;
      private String product_location;
      private int prdquantity;
	  public Long getId() {
		  return id;
	  }
	  public void setId(Long id) {
		  this.id = id;
	  }
	  public String getProductitem() {
		  return productitem;
	  }
	  public void setProductitem(String productitem) {
		  this.productitem = productitem;
	  }
	  public double getPrdouctprice() {
		  return prdouctprice;
	  }
	  public void setPrdouctprice(double prdouctprice) {
		  this.prdouctprice = prdouctprice;
	  }
	  public String getProduct_location() {
		  return product_location;
	  }
	  public void setProduct_location(String product_location) {
		  this.product_location = product_location;
	  }
	  public int getPrdquantity() {
		  return prdquantity;
	  }
	  public void setPrdquantity(int prdquantity) {
		  this.prdquantity = prdquantity;
	  }
	  public Product(Long id, String productitem, double prdouctprice, String product_location, int prdquantity) {
		
		this.id = id;
		this.productitem = productitem;
		this.prdouctprice = prdouctprice;
		this.product_location = product_location;
		this.prdquantity = prdquantity;
	  }
	  public Product() {
		
	  }
      
      
      
}
