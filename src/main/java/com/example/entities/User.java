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

    @Column(nullable = false)
    Integer chipCount;

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

    public Integer getChipCount() {
        return chipCount;
    }

    public void setChipCount(Integer chipCount) {
        this.chipCount = chipCount;
    }

    public User(String username, String password, Integer chipCount) {
        this.username = username;
        this.password = password;
        this.chipCount = chipCount;
    }
}
