package com.brunopereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopereira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
