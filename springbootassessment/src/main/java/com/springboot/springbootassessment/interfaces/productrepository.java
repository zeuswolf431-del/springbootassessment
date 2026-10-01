package com.springboot.springbootassessment.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootassessment.models.Product;

public interface productrepository extends JpaRepository<Product, Long>{

}
