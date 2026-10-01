package com.springboot.springbootassessment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootassessment.models.Product;
import com.springboot.springbootassessment.services.productservices;

@RestController
@RequestMapping("/products")
public class productController {
          
	public productservices services;

	public productController(productservices services) {
		super();
		this.services = services;
	}
	@PostMapping("/add") // request is post end point is/add
	public Product create(@RequestBody Product prdadd)
	{
		return services.addProduct(prdadd);
	}
	@GetMapping("/all")
	public List<Product> getAll()
	{
		return services.getProducts();
	}
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id)
	{
		return services.getProductById(id);
	}
//	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct (@PathVariable Long id) {
		services.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
	
	


	@PutMapping("/{id}")
	public Product updateProduct(
			@PathVariable Long id,
			@RequestBody Product product) {
		return services.updateProduct(id, product);
}

}