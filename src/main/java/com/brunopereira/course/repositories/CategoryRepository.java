package com.brunopereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopereira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  
}
