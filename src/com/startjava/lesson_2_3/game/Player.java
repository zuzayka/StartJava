package com.startjava.lesson_2_3.game;

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
}