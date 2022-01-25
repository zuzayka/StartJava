package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void play() {
        System.out.println("В игре участвуют двое. У каждого игрока не более пяти попыток для угадывания ");
        int targetNum = (int) (Math.random() * 100) + 1;
        player1.setQuantityCalled(0);
        player2.setQuantityCalled(0);
        for (int step = 0; step < 5; step++) {
            guess(player1, step, targetNum);
            if (player1.getNumber(step) == targetNum) {
                break;
            }
            guess(player2, step, targetNum);
            if (player2.getNumber(step) == targetNum) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    Scanner scanner = new Scanner(System.in);

    private void guess(Player player, int step, int targetNum) {
        numberCall(player, step);
        player.setQuantityCalled();
        if (player.getNumber(step) == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(step) +
                    " с " + player.getQuantityCalled() + " попытки.");
        } else if (player.getNumber(step) > targetNum) {
            System.out.println("Данное число больше того, чем загадал компьютер");
        } else if (player.getNumber(step) < targetNum) {
            System.out.println("Данное число меньше того, чем загадал компьютер");
        }
        if (step == 4) {
            System.out.println("у " + player.getName() + " закончились попытки");
        }
    }

    private void numberCall(Player player, int i) {
        boolean b;
        do {
            System.out.println(player.getName() + ", введите число:");
            b = player.setNumber(i, Integer.parseInt(scanner.nextLine()));
        } while (!b);
    }

    private void printNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал числа ");
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
