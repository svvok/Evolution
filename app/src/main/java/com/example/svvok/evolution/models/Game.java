package com.example.svvok.evolution.models;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by svvok on 17.02.2016.
 */
public class Game {
    private static final int K = 2;
    private Player user;
    private ArrayList<Player> opponents;
    private Stack<Card> cards = new Stack<>();
    private int firstPlayer;

    public Game(Player user, ArrayList<Player> opponents) {
        this.user = user;
        this.opponents = opponents;

        int i;
        ArrayList<Card> cardList = new ArrayList<>(63 * K);
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.INK_CLOUD, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.SCAVENGER, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.MIMICRY, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.PIRACY, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.TAIL_LOSS, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.RUNNING, null));
        for (i = 0; i < 4 * K; i++) cardList.add(new Card(Characteristic.SWIMMING, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.SHELL, null));
        for (i = 0; i < 3 * K; i++) cardList.add(new Card(Characteristic.TREMATODE, Characteristic.COMMUNICATION));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.TREMATODE, Characteristic.FAT_TISSUE));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.PARASITE, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.PARASITE, Characteristic.FAT_TISSUE));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.GRAZING, Characteristic.FAT_TISSUE));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.CAMOUFLAGE, Characteristic.FAT_TISSUE));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.HIBERNATION_ABILITY, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.SHARP_VISION, Characteristic.FAT_TISSUE));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.FLIGHT, Characteristic.CARNIVOROUS));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.FLIGHT, Characteristic.SPECIALIZATION_A));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.FLIGHT, Characteristic.SPECIALIZATION_B));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.POISONOUS, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.ANGLERFISH, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.BURROWING, Characteristic.FAT_TISSUE));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.METAMORPHOSE, Characteristic.CARNIVOROUS));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.METAMORPHOSE, Characteristic.SPECIALIZATION_A));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.AMBUSH_HUNTING, Characteristic.SWIMMING));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.AMBUSH_HUNTING, Characteristic.SPECIALIZATION_B));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.VIVIPAROUS, Characteristic.SWIMMING));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.VIVIPAROUS, Characteristic.SPECIALIZATION_B));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.HIGH_BODY_WEIGHT, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.HIGH_BODY_WEIGHT, Characteristic.FAT_TISSUE));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.INTELLECT, Characteristic.FAT_TISSUE));
        for (i = 0; i < 1 * K; i++) cardList.add(new Card(Characteristic.INTELLECT, Characteristic.SPECIALIZATION_A));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.SYMBIOSIS, null));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.COOPERATION, Characteristic.CARNIVOROUS));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.COOPERATION, Characteristic.FAT_TISSUE));
        for (i = 0; i < 2 * K; i++) cardList.add(new Card(Characteristic.COMMUNICATION, Characteristic.CARNIVOROUS));

        Log.i("Game", "cards count = " + cardList.size());

        Random random = new Random();
        while (cardList.size() != 0) {
            i = random.nextInt(cardList.size());
            cards.push(cardList.get(i));
            cardList.remove(i);
        }

        ArrayList<Player> players = new ArrayList<>();
        players.add(user);
        players.addAll(opponents);

        for (i = 0; i < players.size() * 6; i++) {
            players.get(i % players.size()).addCard(popCard());
        }
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

