import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый игрок, введите свое имя:");
        String namePlayerOne;
        namePlayerOne = scanner.nextLine();
        GuessNumber game = new GuessNumber();
        Player playerOne = new Player(namePlayerOne);

        System.out.println("Второй игрок, введите свое имя:");
        String namePlayerTwo;
        namePlayerTwo = scanner.nextLine();
        Player playerTwo = new Player(namePlayerTwo);

        String closureRequest;
        do {
            game.play(playerOne, playerTwo);
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                closureRequest = scanner.nextLine();
            } while (!closureRequest.equals("yes") && !closureRequest.equals("no"));
        } while (closureRequest.equals("yes"));
    }
}