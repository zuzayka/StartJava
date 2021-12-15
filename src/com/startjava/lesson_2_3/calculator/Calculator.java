class Calculator {
    private int firstNum;
    private int secondNum;
    private char operator;

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                System.out.println("Сумма двух чисел: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Разность двух чисел: " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Произведение двух чисел: " + ((long) firstNum * (long) secondNum));
                break;
            case '/':
                System.out.println("Частное двух чисел: " + ((double) firstNum / (double) secondNum));
                break;
            case '^':
                long result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                System.out.println("Возведение в сепень: " + result);
                break;
            case '%':
                System.out.println("Остаток от деления двух чисел: " + (firstNum % secondNum));
                break;
            default:
                System.out.println("Неправильный формат ввода символа математической операции!");
        }
    }
}
