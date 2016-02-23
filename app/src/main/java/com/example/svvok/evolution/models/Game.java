package com.example.svvok.evolution.models;

import java.util.ArrayList;

/**
 * Created by svvok on 17.02.2016.
 */
public class Game {
    private Player user;
    private ArrayList<Player> opponents;
    private Stack<Card> cards = new Stack<>();

    public Game(Player user, ArrayList<Player> opponents) {
        this.user = user;
        this.opponents = opponents;

        //TODO: generate cards
    }

    public Player getUser() {
        return user;
    }

    public ArrayList<Player> getOpponents() {
        return opponents;
    }

    public Card popCard() {
        return cards.pop();
    }


}

