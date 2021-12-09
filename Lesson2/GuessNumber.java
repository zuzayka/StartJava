import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    Scanner scanner = new Scanner(System.in);

    public void play(Player player1, Player player2) {
        int playerNumber;
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println(player1.getName() + ", введите число:");
            playerNumber = Integer.parseInt(scanner.nextLine());
            while(player1.setNumber(playerNumber)) {
                System.out.println(player1.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                player1.setNumber(playerNumber);
            }
            if (player1.getNumber() == targetNum) {
                System.out.println(player1.getName() + ", примите поздравления! Число угадано!");
                break;
            } else if (player1.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

            System.out.println(player2.getName() + ", введите число:");
            playerNumber = Integer.parseInt(scanner.nextLine());
            while(player2.setNumber(playerNumber)) {
                System.out.println(player2.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                player2.setNumber(playerNumber);
            }
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