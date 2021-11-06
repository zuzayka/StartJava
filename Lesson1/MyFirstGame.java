public class MyFirstGame {
    public static void main(String[] args) {
        int pcChoice = (int) (Math.random() * 101);
        System.out.println("pc think number: " + pcChoice);
        System.out.println(findNum(pcChoice));
    }

    public static int findNum(int askNum) {
        int[] temp = new int[100];
        int i = 1;
        int limit = 100;
        temp[0] = limit / 2;
        limit /= 4;
        if (temp[0] > askNum) {
            temp[1] = temp[0] - limit;
        } else if (temp[0] < askNum) {
            temp[1] = temp[0] + limit;
        } else {
            return temp[0];
        }
        limit = 32;
        while (temp[i] != askNum) {
            if (limit > 1) {
                if (limit % 2 != 0) {
                    limit = (limit + 1) / 2;
                }
                limit /= 2;
            }
            if (((temp[i] < askNum) && (temp[i] < temp[i - 1])) || ((temp[i] < askNum) && temp[i] > temp[i - 1])) {
                temp[i + 1] = temp[i] + limit;
                if (temp[i] + limit > 100) {
                    temp[i + 1] = 100;
                }
            } else if (((temp[i] > askNum) && (temp[i] > temp[i - 1]) || (temp[i] > askNum) && temp[i] < temp[i - 1])) {
                temp[i + 1] = temp[i] - limit;
                if (temp[i] - limit < 0) {
                    temp[i + 1] = 0;
                }
            } else if (temp[i] == askNum) {
                return temp[i];
            }
            System.out.println(temp[i]);
            i++;
        }
        return temp[i];
    }
}
