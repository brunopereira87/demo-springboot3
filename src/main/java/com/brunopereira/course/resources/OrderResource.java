package com.brunopereira.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunopereira.course.entities.Order;
import com.brunopereira.course.services.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
  @Autowired
  private OrderService orderService;

  
  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    List<Order> orders = orderService.findAll();
    return ResponseEntity.ok().body(orders);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Long id) {
    Order order = orderService.findById(id);
    return ResponseEntity.ok().body(order);
  }
}
