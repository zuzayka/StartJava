package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый игрок, введите свое имя:");
        Player playerOne = new Player(scanner.nextLine());

        System.out.println("Второй игрок, введите свое имя:");
        Player playerTwo = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String closureRequest;
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                closureRequest = scanner.nextLine();
            } while (!closureRequest.equals("yes") && !closureRequest.equals("no"));
        } while (closureRequest.equals("yes"));
    }
}