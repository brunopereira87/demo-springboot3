package com.brunopereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopereira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
  
}
