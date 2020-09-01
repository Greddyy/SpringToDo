package com.todo.todoapp.services;


import com.todo.todoapp.model.Entry;
import com.todo.todoapp.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> getEntries(){
        return (List<Entry>) entryRepository.findAll();
    }

    //why this converts to optional?
    public Optional<Entry> getEntryById(long id){
        return entryRepository.findById(id);
    }

    public void saveEntry(Entry entry){
        entryRepository.save(entry);
    }


}
