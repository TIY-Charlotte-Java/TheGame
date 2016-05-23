package com.example.entities;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by Ultramar on 5/17/16.
 */
@Entity
@Table(name = "users")
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

    @Column(nullable = false)
    String eMail;

    public static ArrayList<Card> hand = new ArrayList<>();

    public static Integer betAmount;

    public boolean fold = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(Integer betAmount) {
        this.betAmount = betAmount;
    }

    public User() {
    }

    public User(String username, String password, Integer chipCount, String eMail) {
        this.username = username;
        this.password = password;
        this.chipCount = chipCount;
        this.eMail = eMail;
    }

    public void bet() {
        //used to confirm bet
        if (betAmount < chipCount) {
            chipCount = chipCount - betAmount;
            Game.pot += betAmount;
            betAmount = 0;
        } else {
            Game.pot += chipCount;
            chipCount = 0;
            betAmount = 0;
        }
    }

    public Integer raise(Integer amount) {
        //use of multiple buttons
        betAmount = betAmount + amount;
        return betAmount;
    }

    public Integer call() {
        //button to match last bet
        betAmount = Game.lastBet;
        return betAmount;
    }

    public void check() {
        //skip bet
        betAmount = null;
    }

    public void fold() {
        //button to give up like little baby man
        fold = true;

    }
}
