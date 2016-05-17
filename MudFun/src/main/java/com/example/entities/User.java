package com.example.entities;

import javax.persistence.*;

/**
 * Created by Ultramar on 5/17/16.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
