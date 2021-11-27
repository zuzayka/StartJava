class Calculator {
    private static int firstNum;
    private static int secondNum;
    private static char operator;

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
        long result = 1;
        switch (Calculator.operator) {
            case '+':
                System.out.println("Сумма двух чисел: " + (Calculator.firstNum + Calculator.secondNum));
                break;
            case '-':
                System.out.println("Разность двух чисел: " + (Calculator.firstNum - Calculator.secondNum));
                break;
            case '*':
                System.out.println("Произведение двух чисел: " + ((long) Calculator.firstNum * (long) Calculator.secondNum));
                break;
            case '/':
                System.out.println("Частное двух чисел: " + ((double) Calculator.firstNum / (double) Calculator.secondNum));
                break;
            case '^':
                for (int i = 0; i < Calculator.secondNum; i++) {
                    result *= Calculator.firstNum;
                }
                System.out.println("Возведение в сепень: " + result);
                break;
            case '%':
                System.out.println("Остаток от деления двух чисел: " + (Calculator.firstNum % Calculator.secondNum));
                break;
            default:
                System.out.println("Неправильный формат ввода символа математической операции!");
        }
    }
}
