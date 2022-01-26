package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;

    private int[] numbers = new int[5];

    private int countAttempts;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getCurrentNumber() {
        return numbers[countAttempts - 1];
    }

    public boolean setNumber(int number) {
        if (number <= 100 && number > 0) {
            numbers[countAttempts] = number;
            return  true;
        } else {
            return  false;
        }
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts() {
        this.countAttempts++;
    }

    public void setCountAttempts(int i) {
        countAttempts = i;
    }
}