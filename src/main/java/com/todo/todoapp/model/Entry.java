package com.todo.todoapp.model;

import javax.persistence.*;
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
