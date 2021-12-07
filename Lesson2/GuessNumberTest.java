import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String closureRequest;
        int targetNumber;
        
        String namePlayerOne;
        System.out.println("Первый игрок, введите свое имя:");
        namePlayerOne = scanner.nextLine();
        GuessNumber playMethode = new GuessNumber();
        Player playerOne = new Player(namePlayerOne, 0);

        String namePlayerTwo;
        System.out.println("Второй игрок, введите свое имя:");
        namePlayerTwo = scanner.nextLine();
        Player playerTwo = new Player(namePlayerTwo, 0);

        do {
            playMethode.play(playerOne, playerTwo);
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                closureRequest = scanner.nextLine();
            } while (!closureRequest.equals("yes") && !closureRequest.equals("no"));
        } while (closureRequest.equals("yes"));
    }
}