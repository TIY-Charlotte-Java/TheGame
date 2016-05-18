package com.example.entities;

import java.util.ArrayList;

/**
 * Created by Ultramar on 5/18/16.
 */
public class Card {

    Rank rank;
    Suite suite;


    public enum Suite {
        HEARTS,
        CLUBS,
        DIAMONDS,
        SPADES

    }

    public enum Rank {
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

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }


    public static ArrayList<Card> buildDeck() {
        ArrayList<Card> Deck = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            for (Suite suite : Suite.values()) {
                Deck.add(new Card(rank, suite));
            }
        }
        return Deck;
    }
}