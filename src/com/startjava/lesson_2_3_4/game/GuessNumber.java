package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("В игре участвуют двое. У каждого игрока не более пяти попыток для угадывания ");
        int targetNum = (int) (Math.random() * 100) + 1;
        player1.incrementAttempts(0);
        player2.incrementAttempts(0);
        for (int step = 0; step < 5; step++) {
            if (guess(player1, targetNum)) {
                break;
            }
            if (guess(player2, targetNum)) {
                break;
            }
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    private boolean guess(Player player, int targetNum) {
        inputNumber(player);
        player.incrementAttempts();
        if (player.getCountAttempts() == 5) {
            System.out.println("у " + player.getName() + " закончились попытки");
        }
        int currentNum = player.getCurrentNumber();
        if (currentNum == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + currentNum +
                    " с " + player.getCountAttempts() + " попытки.");
            return  true;
        } if (currentNum > targetNum) {
            System.out.println("Данное число больше того, чем загадал компьютер");
        } else if (currentNum < targetNum) {
            System.out.println("Данное число меньше того, чем загадал компьютер");
        }
        return  false;
    }

    private void inputNumber(Player player) {
        boolean b;
        do {
            System.out.println(player.getName() + ", введите число:");
        } while (!player.setNumber(scanner.nextInt()));
    }

    private void printNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + " назвал числа ");
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
