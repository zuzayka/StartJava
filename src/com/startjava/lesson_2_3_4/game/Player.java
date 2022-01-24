package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class Player {
    private String name;

    private int[] numbers = new int[5];

    private int quantityCalled;

    private int[] copyNumbers;

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    Scanner scanner = new Scanner(System.in);

    public void setNumber(int i) {
        int number;
        do {
            System.out.println(name + ", введите число:");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0 || number > 100);
        numbers[i] = number;
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

    public int[] getCopyNumbers() {
        return copyNumbers;
    }

    public void setCopyNumbers() {
        this.copyNumbers = Arrays.copyOf(getNumbers(), getQuantityCalled());
    }

    Player(String name) {
        this.name = name;
    }
}