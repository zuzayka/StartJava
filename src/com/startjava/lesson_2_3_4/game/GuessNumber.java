package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    static Scanner scanner = new Scanner(System.in);
    static Player[] players = {GuessNumberTest.playerOne, GuessNumberTest.playerTwo};

    private static int enterNumber(String name) {
        int number;
        do {
            System.out.println(name + ", введите число:");
            number = Integer.parseInt(scanner.nextLine());
        } while (number <= 0 || number > 100);
        return number;
    }

    private static String compareNumbers(int playerNum, int targetNum) {
        if (playerNum != targetNum) {
            return playerNum > targetNum ? "больше" : "меньше";
        } else return "Число угадано!";
    }

    static int[] winner = new int[2];

    static int playStart() {
        int targetNum = (int) (Math.random() * 100) + 1;
        int step = 0;

        while (true) {
            players[step % 2].setNumbers(step / 2, enterNumber(players[step % 2].getName()));
            if (compareNumbers(players[step % 2].getNumbers(step / 2), targetNum).equals("Число угадано!")) {
                winner[step % 2] += 1;
                System.out.println("Игрок " + players[step % 2].getName() + " угадал число " + players[step % 2].getNumbers(step / 2) + " с " + (step / 2 + 1) + " попытки.");
                winner[step % 2]++;
                step++;
                break;
            } else if (step == 8 + step % 2) {
                System.out.println("у " + players[step % 2].getName() + " закончились попытки");
                if (step == 9) {
                    break;
                }
            }
            System.out.println("Данное число " + compareNumbers(players[step % 2].getNumbers(step / 2), targetNum) + " того, чем загадал компьютер");
            step++;
        }
        return step;
    }

    public static boolean play() {
        for (int j = 0; j < 3; j++) {
            int steps = playStart();
            int[] copyNumbers1 = Arrays.copyOf(GuessNumberTest.playerOne.getNumbers(), steps / 2 + steps % 2);
            System.out.print("Игрок " + players[0].getName() + " назвал числа ");
            for (int i = 0; i < steps / 2 + steps % 2; ) {
                System.out.print(copyNumbers1[i] + " ");
                i++;
            }
            System.out.println();

            int[] copyNumbers2 = Arrays.copyOf(GuessNumberTest.playerTwo.getNumbers(), steps / 2);
            System.out.print("Игрок " + players[1].getName() + " назвал числа ");
            for (int i = 0; i < steps / 2; ) {
                System.out.print(copyNumbers2[i] + " ");
                i++;
            }

            System.out.println("\n");
            Arrays.fill(players[0].getNumbers(), 0, steps / 2 + steps % 2, 0);
            Arrays.fill(players[1].getNumbers(), 0, steps / 2, 0);
        }
        if (winner[0] > winner[1]) {
            System.out.println("По результатам трех игр победил " + GuessNumberTest.playerOne.getName());
            return true;
        } else if (winner[0] < winner[1]) {
            System.out.println("По результатам трех игр победил " + GuessNumberTest.playerTwo.getName());
            return true;
        } else {
            System.out.println("По результатам трех игр ничья");
            return false;
        }
    }
}
