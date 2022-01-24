package com.startjava.lesson_2_3_4.game;

public class GuessNumber {
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static String begin = "В игре участвуют двое. У каждого игрока не более пяти попыток для угадывания ";

    public void play() {
        int targetNum = (int) (Math.random() * 100) + 1;
        player1.setQuantityCalled(0);
        player2.setQuantityCalled(0);
        for (int step = 0; step < 5; step++) {
            guess(player1, step, targetNum);
            if (player1.getNumbers(step) == targetNum) {
                break;
            }
            guess(player2, step, targetNum);
            if (player2.getNumbers(step) == targetNum) {
                break;
            }
        }
        printNumbers(player1);
        System.out.println();
        printNumbers(player2);
    }

    private void guess(Player someplayer, int step, int targetNum) {
        someplayer.setNumbers(step);
        someplayer.setQuantityCalled();
        if (someplayer.getNumbers(step) == targetNum) {
            System.out.println("Игрок " + someplayer.getName() + " угадал число " + someplayer.getNumbers(step) +
                    " с " + someplayer.getQuantityCalled() + " попытки.");
        } else if (step == 4) {
            System.out.println("у " + someplayer.getName() + " закончились попытки");
        } else if (someplayer.getNumbers(step) > targetNum) {
            System.out.println("Данное число больше того, чем загадал компьютер");
        } else if (someplayer.getNumbers(step) < targetNum) {
            System.out.println("Данное число меньше того, чем загадал компьютер");
        }
    }

    private void printNumbers(Player somePlayer) {
        System.out.print("Игрок " + somePlayer.getName() + " назвал числа ");
        somePlayer.setCopyNumbers();
        for (int num : somePlayer.getCopyNumbers()) {
            System.out.print(num + " ");
        }
    }
}
