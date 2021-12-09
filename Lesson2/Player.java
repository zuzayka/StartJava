public class Player {
    private String name;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        this.number = number;
        if (!(number > 0) || !(number <= 100)) {
            return true;
        } else {
            return false;
        }
    }
}