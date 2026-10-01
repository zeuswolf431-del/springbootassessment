package com.springboot.springbootassessment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springbootassessment.ProductNotFound;
import com.springboot.springbootassessment.interfaces.productrepository;
import com.springboot.springbootassessment.models.Product;


@Service
public class productservices {

	public productrepository repo;

	public productservices(productrepository repo) {
		
		this.repo = repo;
	}
	
	public Product addProduct(Product product)
	{
		return repo.save(product);
	}
	
	public List<Product> getProducts()
	{
		return repo.findAll();
	}
	
	public Product getProductById(Long id)
	{
		return repo.findById(id)
				.orElseThrow(()->
						new ProductNotFound("Product not found" + id));
	}
	
	 public void deleteProduct(Long id)
	{
		if(!repo.existsById(id))
		{
			throw new RuntimeException("Product not found");
		}
		repo.deleteById(id);
	}
	
	// update means already existed we have to change name location based on id
	public Product updateProduct(Long id, Product product) 
	{
		Product existingProduct = repo.findById(id)
				   .orElseThrow(()->
				   new RuntimeException("product not found"));
		existingProduct.setId(product.getId());
		existingProduct.setProductitem(product.getProductitem());
		existingProduct.setPrdouctprice(product.getPrdouctprice());
		existingProduct.setProduct_location(product.getProduct_location());
		existingProduct.setPrdquantity(product.getPrdquantity());
		
		return repo.save(existingProduct);
	}
	
}
