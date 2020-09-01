package com.todo.todoapp.repository;

import com.todo.todoapp.model.Entry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, Long> {
    List<Entry> findAllById (Long id);
}
