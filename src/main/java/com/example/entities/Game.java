package com.example.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ultramar on 5/18/16.
 */
public class Game {

    public static HashMap<String, User> users = new HashMap<>();
    ArrayList<Card> Deck = shuffle(Card.buildDeck());
    ArrayList<Card> share = new ArrayList<>();
    public static Integer pot = 0;
    public static Integer lastBet = User.betAmount;


    public ArrayList<Card> shuffle(ArrayList<Card> Deck) {
        ArrayList<Card> newDeck = new ArrayList<>();

        for (int i = 0; i < Deck.size(); i++) {
            int j = randomWithRange(0, Deck.size());
            newDeck.add(Deck.get(j));
        }
        return newDeck;
    }

    public void deal() {
        while (User.hand.size() < 2) {
            User.hand.add(Deck.get(0));
            Deck.remove(0);
        }
    }

    public void Flop() {
        while (share.size() < 3) {
            share.add(Deck.get(0));
            Deck.remove(0);
        }

    }

    public void TurnAndRiver() {
        share.add(Deck.get(0));
        Deck.remove(0);
    }



    int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
