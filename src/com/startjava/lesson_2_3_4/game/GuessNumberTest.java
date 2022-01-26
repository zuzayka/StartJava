package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый игрок, введите свое имя:");
        Player playerOne = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите свое имя:");
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String option;
        do {
            game.play();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]");
                option = scanner.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (option.equals("yes"));
    }
}