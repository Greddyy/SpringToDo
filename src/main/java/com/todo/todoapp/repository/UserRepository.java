package com.todo.todoapp.repository;

import com.todo.todoapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
