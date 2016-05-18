package com.example.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ultramar on 5/18/16.
 */
public class Game {

    List<User> users = new ArrayList<>();
    ArrayList<Card> Deck = Card.buildDeck();

    public ArrayList<Card> shuffle(ArrayList<Card> Deck) {
        ArrayList<Card> newDeck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            int j = randomWithRange(0, Deck.size());
            newDeck.add(Deck.get(j));
        }
        return newDeck;
    }

    public void deal() {

    }

    public void bet() {

    }

    public void raise() {

    }

    public void call() {

    }

    public void fold() {

    }

    int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
