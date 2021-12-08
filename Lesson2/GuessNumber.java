import java.util.Scanner;

public class GuessNumber {
    private int playerNumber;
    private Scanner scanner = new Scanner(System.in);

    public void play(Player playerO, Player playerT) {
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {
            do {
                System.out.println(playerO.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
            } while (!(playerNumber > 0) || !(playerNumber <= 100));
            
            playerO.setNumber(playerNumber);
            if (playerO.getNumber() == targetNum) {
                System.out.println(playerO.getName() + ", примите поздравления! Число угадано!");
                return;
            } else if (playerO.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            do {
                System.out.println(playerT.getName() + ", введите число:");
                playerNumber = Integer.parseInt(scanner.nextLine());
            } while (!(playerNumber > 0) || !(playerNumber <= 100));
            
            playerT.setNumber(playerNumber);
            if (playerT.getNumber() == targetNum) {
                System.out.println(playerT.getName() + ", примите поздравления! Число угадано!");
                return;
            } else if (playerT.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}