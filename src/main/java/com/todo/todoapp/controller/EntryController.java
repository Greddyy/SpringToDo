package com.todo.todoapp.controller;

import com.todo.todoapp.model.Entry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryController {


    public void saveEntry(@RequestBody Entry entry){

    }

    public List<Entry> getAllEntries(){

        return null;
    }
}
