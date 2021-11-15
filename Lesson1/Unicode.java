public class Unicode {
    public static void main(String[] args) {
        for (int i = 33; i <= 126; i++) {
            if ((i + 7) % 10 == 0) {
                System.out.println(" ");
            }
            System.out.print((char) i + " ");
        }
    }
}
