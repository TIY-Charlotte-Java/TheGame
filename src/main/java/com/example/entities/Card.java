package com.example.entities;

import java.util.ArrayList;

/**
 * Created by Ultramar on 5/18/16.
 */
public class Card {

    String rank;
    Suites suite;


    public enum Suites {
        HEARTS,
        CLUBS,
        DIMONDS,
        SPADES

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Suites getSuite() {
        return suite;
    }

    public void setSuite(Suites suite) {
        this.suite = suite;
    }

    public Card(String rank, Suites suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public static ArrayList<Card> buildDeck() {
        ArrayList<Card> Deck = new ArrayList<>();


    }
}
