public class GuessNumber {
    private int playerNumber;

    public void play(Player playerOne, Player playerTwo) {
        int targetNum = (int) (Math.random() * 100) + 1;
        while (true) {

            System.out.println(playerOne.getName() + ", введите число:");
            playerOne.setNumber();
            if (playerOne.getNumber() == targetNum) {
                System.out.println(playerOne.getName() + ", примите поздравления! Число угадано!");
                return;
            } else if (playerOne.getNumber() > targetNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

            System.out.println(playerTwo.getName() + ", введите число:");
            playerTwo.setNumber();
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