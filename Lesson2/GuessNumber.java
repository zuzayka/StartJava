import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    Scanner scanner = new Scanner(System.in);

    public void play(Player playerOne, Player playerTwo) {
        int playerNumber;
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println(playerOne.getName() + ", введите число:");
            playerNumber = Integer.parseInt(scanner.nextLine());
            while(playerOne.setNumber(playerNumber)) {
                System.out.println(playerOne.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                playerOne.setNumber(playerNumber);
            }
            if (playerOne.getNumber() == targetNum) {
                System.out.println(playerOne.getName() + ", примите поздравления! Число угадано!");
                break;
            } else if (playerOne.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

            System.out.println(playerTwo.getName() + ", введите число:");
            playerNumber = Integer.parseInt(scanner.nextLine());
            while(playerTwo.setNumber(playerNumber)) {
                System.out.println(playerTwo.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
                playerTwo.setNumber(playerNumber);
            }
            if (playerTwo.getNumber() == targetNum) {
                System.out.println(playerTwo.getName() + ", примите поздравления! Число угадано!");
                break;
            } else if (playerTwo.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}