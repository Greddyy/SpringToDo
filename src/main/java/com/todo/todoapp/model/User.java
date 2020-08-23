package com.todo.todoapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private boolean admin;
    @OneToMany(mappedBy = "entries")
    private List<Entry> entryList;
}
