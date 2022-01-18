package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumberTest {
    static Player playerOne = new Player();
    static Player playerTwo = new Player();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В игре участвуют двое. У каждого игрока не более пяти попыток для угадывания числа " + "от 1 до 100.\nПобедитель определяется по результатам трех игр.");
        System.out.println("Первый игрок, введите свое имя:");
        playerOne.setName(scanner.nextLine());
        System.out.println("Второй игрок, введите свое имя:");
        playerTwo.setName(scanner.nextLine());

        String terminatingRequest;
        do {
            if (GuessNumber.play()) {
                System.out.println("Победитель выявлен");
            }
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                terminatingRequest = scanner.nextLine();
            } while (!terminatingRequest.equals("yes") && !terminatingRequest.equals("no"));
        } while (terminatingRequest.equals("yes"));
    }
}