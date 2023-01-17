package com.randikalakmal.controller;

import com.randikalakmal.model.User;
import com.randikalakmal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        boolean results = userService.saveUser(user);
        if (results)
            return ResponseEntity.ok("User Created Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> fetchAllUser(){
        List<User> users;
        users= userService.fetchAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable("id") Long id){
        User user;
        user = userService.fetchUserbyId(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        boolean result = userService.deleteUser(id);
        if (result)
            return ResponseEntity.ok("User Deleted Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable("id") Long id){
        boolean result  = userService.updateUserById(user,id);
        if (result)
            return ResponseEntity.ok("User Updated Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
