package com.example.svvok.evolution.models;

/**
 * Created by svvok on 17.02.2016.
 */
public class Card {
    protected Characteristic characteristic1;
    protected Characteristic characteristic2;
    private boolean c2IsMain;

    public Card(Characteristic characteristic1, Characteristic characteristic2){
        this.characteristic1 = characteristic1;
        this.characteristic2 = characteristic2;
    }

    public Characteristic getCharacteristic1() {
        return characteristic1;
    }

    public void setCharacteristic1(Characteristic characteristic1) {
        this.characteristic1 = characteristic1;
    }

    public Characteristic getCharacteristic2() {
        return characteristic2;
    }

    public void setCharacteristic2(Characteristic characteristic2) {
        this.characteristic2 = characteristic2;
    }

    public boolean isC2IsMain() {
        return c2IsMain;
    }

    public void setC2IsMain(boolean c2IsMain) {
        this.c2IsMain = c2IsMain;
    }
}
