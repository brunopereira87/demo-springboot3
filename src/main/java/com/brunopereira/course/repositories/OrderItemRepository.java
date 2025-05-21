package com.brunopereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopereira.course.entities.OrderItem;
import com.brunopereira.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
  
}
