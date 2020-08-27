package com.todo.todoapp.controller;

import com.todo.todoapp.model.Entry;
import com.todo.todoapp.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    public void saveUser(@RequestBody User user){

    }

    public List<User> getAllUsers(){

        return null;
    }
}
