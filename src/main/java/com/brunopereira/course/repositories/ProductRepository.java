package com.brunopereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopereira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
