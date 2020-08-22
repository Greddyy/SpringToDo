package com.todo.todoapp.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Username;
    private String Password;
    private String ConfirmPassword;
    private boolean isAdmin;
    @OneToMany(mappedBy = "Entry")
    private List<Entry> entryList;
}
