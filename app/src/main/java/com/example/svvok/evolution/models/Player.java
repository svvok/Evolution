package com.example.svvok.evolution.models;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by svvok on 17.02.2016.
 */
public class Player {
    private String nickname;
    private Bitmap avatar;
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addCards(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    public int getCardsCount() {
        return cards.size();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void killAnimal(Animal animal) {
        animals.remove(animal);
    }

    public int getAnimalsCount() {
        return animals.size();
    }

    public int getPoints() {
        int points = 2 * animals.size();
        for (Animal animal : animals) {
            points += animal.getCharacteristics().size() + animal.getPairCharacteristics().size();
            points += animal.countUpAdditionalCharacteristicPoints();
        }
        return points;
    }

}
