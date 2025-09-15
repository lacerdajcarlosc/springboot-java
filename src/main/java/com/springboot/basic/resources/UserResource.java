package com.springboot.basic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.basic.entities.User;

@RestController
@RequestMapping(value = "/users")   
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        list.add(new User(1L, "Maria", "maria@gmail.com", "988888888", "123456"));
        list.add(new User(2L, "Joao", "joao@gmail.com", "988888888", "123456"));

        return ResponseEntity.ok().body(list);
    }   
    
}                       