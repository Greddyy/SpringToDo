package com.todo.todoapp.repository;

import com.todo.todoapp.model.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {
}
