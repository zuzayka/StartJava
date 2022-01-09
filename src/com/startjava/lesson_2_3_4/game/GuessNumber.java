package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);
    Player[] players = new Player[2];

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        players[0] = player1;
        players[1] = player2;
    }

    public int numberEnter(String name) {
        int number;
        do {
            System.out.println(name + ", введите число:");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0 || number > 100);
        return number;
    }

    public String compareNumbers(int playerNum, int targetNum) {
        return playerNum > targetNum ? "Данное число больше того, что загадал компьютер" :
                playerNum < targetNum ? "Данное число меньше того, что загадал компьютер" :
                        "Число угадано!";
    }

    static int[] winner = new int[2];

    public int play() {
        int targetNum = (int) (Math.random() * 100) + 1;
        int step = 0;

        while (true) {
            Player.numbers[step] = numberEnter(players[step % 2].getName());
            System.out.println(compareNumbers(Player.numbers[step], targetNum));
            if (compareNumbers(Player.numbers[step], targetNum).equals("Число угадано!")) {
                winner[step % 2] += 1;
                System.out.println("Игрок " + players[step % 2].getName() + " угадал число " + Player.numbers[step] +
                        " с " + (step + 1) + " попытки.");
                step++;
                break;
            } else if (step == 8) {
                System.out.println("у " + player1.getName() + " закончились попытки");
            } else if (step == 9) {
                System.out.println("у " + player2.getName() + " закончились попытки");
            }
            step++;
            if (step == 10) {
                break;
            }
        }
        return step;
    }

}