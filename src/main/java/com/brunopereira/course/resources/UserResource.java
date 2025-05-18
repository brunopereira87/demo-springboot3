package com.brunopereira.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunopereira.course.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  
  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Maria", "2dHbD@example.com", "99999999999", "123456");
    return ResponseEntity.ok().body(u);
  }
}
