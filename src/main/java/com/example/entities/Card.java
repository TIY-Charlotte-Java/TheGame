package com.example.entities;

import java.util.ArrayList;

/**
 * Created by Ultramar on 5/18/16.
 */
public class Card {

    Ranks rank;
    Suites suite;


    public enum Suites {
        HEARTS,
        CLUBS,
        DIMONDS,
        SPADES

    }

    public enum Ranks {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Suites getSuite() {
        return suite;
    }

    public void setSuite(Suites suite) {
        this.suite = suite;
    }

    public Card(Ranks rank, Suites suite) {
        this.rank = rank;
        this.suite = suite;
    }


    public static ArrayList<Card> buildDeck() {
        ArrayList<Card> Deck = new ArrayList<>();

        while (Deck.size() < 52) {
            Deck.add(new Card(Ranks.ACE, Suites.CLUBS));
        }
        return Deck;
    }
}