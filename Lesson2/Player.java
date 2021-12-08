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
                this.number = Integer.parseInt(scanner.nextLine());
            } while (!(this.number > 0) || !(this.number <= 100));
    }
}