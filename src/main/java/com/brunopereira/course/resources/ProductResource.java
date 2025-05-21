package com.brunopereira.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunopereira.course.entities.Product;
import com.brunopereira.course.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
  @Autowired
  private ProductService productService;

  
  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> products = productService.findAll();
    return ResponseEntity.ok().body(products);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product product = productService.findById(id);
    return ResponseEntity.ok().body(product);
  }
}
