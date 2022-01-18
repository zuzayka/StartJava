package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;

    private int[] numbers = new int[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers(int i) {
        return numbers[i];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int i, int number) {
        numbers[i] = number;
    }
}