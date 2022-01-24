package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println(GuessNumber.begin);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый игрок, введите свое имя:");
        Player playerOne = new Player(scanner.nextLine());
        System.out.println("Второй игрок, введите свое имя:");
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String terminatingRequest;
        do {
            game.play();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]");
                terminatingRequest = scanner.nextLine();
            } while (!terminatingRequest.equals("yes") && !terminatingRequest.equals("no"));
        } while (terminatingRequest.equals("yes"));
    }
}