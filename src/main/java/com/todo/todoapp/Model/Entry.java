package com.todo.todoapp.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Entries")
public class Entry {

    @Id
    private long id;
    private String entryName;
    private String entryDescription; //content
    private boolean completed;
    private Timestamp dateEntered;
    @ManyToOne
    @JoinColumn(name="User", insertable = false, updatable = false)
    private User user;


}
