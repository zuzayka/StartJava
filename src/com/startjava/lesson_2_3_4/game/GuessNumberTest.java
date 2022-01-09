package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В игре участвуют двое. У каждого игрока не более пяти попыток для угадывания числа " +
                "от 1 до 100.\n Победитель определяется по результатам трех игр.");
        System.out.println("Первый игрок, введите свое имя:");
        Player playerOne = new Player(scanner.nextLine());

        System.out.println("Второй игрок, введите свое имя:");
        Player playerTwo = new Player(scanner.nextLine());

        String terminatingRequest;
        do {
            for (int j = 0; j < 3; j++) {
                GuessNumber game = new GuessNumber(playerOne, playerTwo);

                int arrLength = game.play();
                int[] copyNumbers = Arrays.copyOf(Player.numbers, arrLength);
                System.out.print("Игрок " + playerOne.getName() + " назвал числа ");
                for (int i = 0; i < arrLength; ) {
                    System.out.print(copyNumbers[i] + " ");
                    i += 2;
                }
                System.out.println();

                System.out.print("Игрок " + playerTwo.getName() + " назвал числа ");
                for (int i = 1; i < arrLength; ) {
                    System.out.print(copyNumbers[i] + " ");
                    i += 2;
                }
                System.out.println("\n");
                Arrays.fill(Player.numbers, 0, arrLength, 0);
            }
            if (GuessNumber.winner[0] > GuessNumber.winner[1]) {
                System.out.println("По результатам трех игр победил " + playerOne.getName());
            } else if (GuessNumber.winner[0] < GuessNumber.winner[1]) {
                System.out.println("По результатам трех игр победил " + playerTwo.getName());
            } else {
                System.out.println("По результатам трех игр ничья");
            }
            Arrays.fill(GuessNumber.winner, 0);
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                terminatingRequest = scanner.nextLine();
            } while (!terminatingRequest.equals("yes") && !terminatingRequest.equals("no"));
        } while (terminatingRequest.equals("yes"));
    }
}