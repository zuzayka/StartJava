import java.util.Scanner;

public class GuessNumber {
    private int playerNumber;
    private Scanner scanner = new Scanner(System.in);

    public void play(Player playerOne, Player playerTwo) {
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {
            do {
                System.out.println(playerOne.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
            } while (!(playerNumber > 0) || !(playerNumber <= 100));
            
            playerOne.setNumber(playerNumber);
            if (playerOne.getNumber() == targetNum) {
                System.out.println(playerOne.getName() + ", примите поздравления! Число угадано!");
                return;
            } else if (playerOne.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            do {
                System.out.println(playerTwo.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
            } while (!(playerNumber > 0) || !(playerNumber <= 100));
            
            playerTwo.setNumber(playerNumber);
            if (playerTwo.getNumber() == targetNum) {
                System.out.println(playerTwo.getName() + ", примите поздравления! Число угадано!");
                return;
            } else if (playerTwo.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}