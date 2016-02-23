package com.example.svvok.evolution.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by svvok on 17.02.2016.
 */
public class Animal {

    protected Card animalCard;
    private Set<Characteristic> characteristics = new HashSet<>();
    private Set<Characteristic> pairCharacteristics = new HashSet<>();
    protected ArrayList<Food> hasFood = new ArrayList<>();
    private int needFood;

    public Animal(Card animalCard) {
        this.animalCard = animalCard;
    }

    public Card getAnimalCard() {
        return animalCard;
    }

    public Set<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void addCharacteristic(Characteristic characteristic) {
        //TODO : check
        this.characteristics.add(characteristic);
    }

    public void removeCharacteristic(Characteristic characteristic) {
        this.characteristics.remove(characteristic);
    }

    public Set<Characteristic> getPairCharacteristics() {
        return pairCharacteristics;
    }

    public void addPairCharacteristics(Characteristic pairCharacteristic) {
        this.pairCharacteristics.add(pairCharacteristic);
    }

    public void removePairCharacteristics(Characteristic pairCharacteristic) {
        this.pairCharacteristics.remove(pairCharacteristic);
    }

    public ArrayList<Food> getFood() {
        return hasFood;
    }

    public int getFoodCount() {
        return hasFood.size();
    }

    public void addFood(Food food) {
        this.hasFood.add(food);
    }

    public int getNeedFoodCount() {
        return needFood;
    }

    public void updateNeedFood() {
        this.needFood = 1 + countUpAdditionalCharacteristicPoints();
    }

    public int countUpAdditionalCharacteristicPoints() {
        int points = 0;
        //TODO: just do it!
        return points;
    }

}
