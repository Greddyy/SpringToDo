package com.todo.todoapp.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "entries")
public class Entry {

    @Id
    private long id;
    private String name;
    private String description; //content
    private boolean completed;
    private LocalDateTime localDateTime;
    @ManyToOne
    @JoinColumn(name="User", insertable = false, updatable = false)
    private User user;


}
