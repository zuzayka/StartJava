import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    private Scanner scanner = new Scanner(System.in);

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        do {
                number = Integer.parseInt(scanner.nextLine());
            } while (!(number > 0) || !(number <= 100));
    }
}