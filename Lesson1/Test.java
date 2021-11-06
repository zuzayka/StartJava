public class Main {

    public static void main(String[] args) {
                System.out.println(minFunction(3, 6));
        public static int minFunction(int n1, int n2) {
            int min;
            if (n1 > n2)
                min = n2;
            else
                min = n1;

            return min;
        }


    }