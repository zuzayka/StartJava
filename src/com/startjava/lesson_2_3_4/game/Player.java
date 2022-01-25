package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;

    private int[] numbers = new int[5];

    private int quantityCalled;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, getQuantityCalled());
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public boolean setNumber(int i, int number) {
        numbers[i] = number;
        return number <= 100 && number > 0;
    }

    public int getQuantityCalled() {
        return quantityCalled;
    }

    public void setQuantityCalled() {
        this.quantityCalled++;
    }

    public void setQuantityCalled(int i) {
        this.quantityCalled = i;
    }
}