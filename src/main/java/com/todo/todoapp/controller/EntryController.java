package com.todo.todoapp.controller;

import com.todo.todoapp.model.Entry;
import com.todo.todoapp.repository.EntryRepository;
import com.todo.todoapp.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntryController {

    @Autowired
    EntryService entryService;
    EntryRepository entryRepository;

    @PostMapping("/entry")
    public ResponseEntity saveEntry(@RequestBody Entry entry) {
        return new ResponseEntity(entryService.saveEntry(entry), HttpStatus.valueOf(201));


    }

    @GetMapping("/entries")
    public List<Entry> getAllEntries() {
        return entryService.getEntries();
    }

    @GetMapping("/getEntryById/{id}")
    public ResponseEntity<Entry> getEntryById(@PathVariable long id) {
        Optional<Entry> optionalEntry = entryRepository.findById(id);
        if (optionalEntry.isPresent()) {
            Entry entry = optionalEntry.get();
            return ResponseEntity.status(HttpStatus.OK).body(entry);
        } else {
            return new ResponseEntity<>(HttpStatus.valueOf(404));

        }
    }

}


