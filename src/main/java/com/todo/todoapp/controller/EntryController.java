package com.todo.todoapp.controller;

import com.todo.todoapp.model.Entry;
import com.todo.todoapp.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntryController {

    @Autowired
    EntryService entryService;

    @PostMapping("/entry")
    public void saveEntry(@RequestBody Entry entry){
        entryService.saveEntry(entry);
    }
    @GetMapping("/getEntries")
    public List<Entry> getAllEntries(){
        return entryService.getEntries();
    }
    @GetMapping
    public Optional<Entry> getEntryById(@PathVariable long id){
        return entryService.getEntryById(id);
    }
}
