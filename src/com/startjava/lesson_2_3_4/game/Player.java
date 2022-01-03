package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        if ((number > 0) && (number <= 100)) {
            this.number = number;
            return true;
        }
        return false;
    }

    static int[] numbers = new int[10];
}