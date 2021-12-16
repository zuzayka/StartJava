package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 101);
        System.out.println("pc think number: " + targetNumber + "\n");
        System.out.println(findNum(targetNumber));
    }

    public static int findNum(int targetNumber) {
        int playerNumber = 50;
        int stepNum = 64;
        while (playerNumber != targetNumber) {
            System.out.println(playerNumber);
            stepNum /= 2;
            if (playerNumber < targetNumber) {
                playerNumber += stepNum;
                if (playerNumber > 100) {
                    playerNumber = 100;
                }
                continue;
            } else if (playerNumber > targetNumber) {
                playerNumber -= stepNum;
                if (playerNumber < 0) {
                    playerNumber = 0;
                }
            }
        }
        return playerNumber;
    }
}
