public class MyFirstGame {
    public static void main(String[] args) {
        int pcChoice = (int) (Math.random() * 101);
        System.out.println("pc think number: " + pcChoice + "\n");
        System.out.println(findNum(pcChoice));
    }

    public static int findNum(int askNum) {
        int num = 50;
        int stepNum = 64;
        while (num != askNum) {
            System.out.println(num);
            stepNum /= 2;
            if (num < askNum) {
                num += stepNum;
                if (num > 100) {
                    num = 100;
                }
                continue;
            } else if (num > askNum) {
                num -= stepNum;
                if (num < 0) {
                    num = 0;
                }
            }
        }
        return num;
    }
}
