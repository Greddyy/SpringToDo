package com.todo.todoapp.Model;

import java.sql.Timestamp;

public class Entry {

    private long id;
    private String entryName;
    private String entryDescription; //content
    private boolean completed;
    private Timestamp dateEntered;

}
