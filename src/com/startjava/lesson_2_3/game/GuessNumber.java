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
        int playerNumber;
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {
            do {
                System.out.println(player1.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                player1.setNumber(playerNumber);
            } while (player1.getNumber() <= 0 || player1.getNumber() > 100);
            if (player1.getNumber() == targetNum) {
                System.out.println(player1.getName() + ", примите поздравления! Число угадано!");
                break;
            } else if (player1.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

            do {
                System.out.println(player2.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                player2.setNumber(playerNumber);
            } while(player2.getNumber() <= 0 || player2.getNumber() > 100);
            if (player2.getNumber() == targetNum) {
                System.out.println(player2.getName() + ", примите поздравления! Число угадано!");
                break;
            } else if (player2.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}