package com.brunopereira.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunopereira.course.entities.Category;
import com.brunopereira.course.services.CategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
  @Autowired
  private CategoryService categoryService;

  
  @GetMapping
  public ResponseEntity<List<Category>> findAll() {
    List<Category> categories = categoryService.findAll();
    return ResponseEntity.ok().body(categories);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findById(@PathVariable Long id) {
    Category category = categoryService.findById(id);
    return ResponseEntity.ok().body(category);
  }
}
