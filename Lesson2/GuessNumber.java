import java.util.Scanner;

public class GuessNumber {
    int i = 1;
    int playerNumber;
    Scanner scanner = new Scanner(System.in);
    String tempString;
    int tempInt;
    Player firstPlayer = new Player(tempString, tempInt);
    Player secondPlayer = new Player(tempString, tempInt);
    int targetNum = (int) (Math.random() * 100) + 1;

    public void play(Player firstPlayer, Player secondPlayer) {
        while (true) {
            if ((i + 1) % 2 == 0) {
                do {
                    System.out.println(firstPlayer.getName() + ", введите число:");
                    playerNumber = Integer.parseInt(scanner.nextLine());
                } while (!(playerNumber > 0) || !(playerNumber <= 100));
                
                firstPlayer.setNumber(playerNumber);
                if (firstPlayer.getNumber() == targetNum) {
                    System.out.println(firstPlayer.getName() + ", примите поздравления! Число угадано!");
                    return;
                } else if (firstPlayer.getNumber() > targetNum) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    i++;
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    i++;
                }
            } else {
                do {
                    System.out.println(secondPlayer.getName() + ", введите число:");
                    playerNumber = Integer.parseInt(scanner.nextLine());
                } while (!(playerNumber > 0) || !(playerNumber <= 100));
                
                secondPlayer.setNumber(playerNumber);
                if (secondPlayer.getNumber() == targetNum) {
                    System.out.println(secondPlayer.getName() + ", примите поздравления! Число угадано!");
                    return;
                } else if (secondPlayer.getNumber() > targetNum) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    i++;
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    i++;
                }
            }
        }
    }
}