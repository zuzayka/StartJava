class Calculator {
    private int firstNum;
    private int secondNum;
    private char operator;

    public void setFirstNum(int firstNum)
    {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        long resultLong = 1;
        switch (this.operator) {
            case '+':
                System.out.println("Сумма двух чисел: " + (this.firstNum + this.secondNum));
                break;
            case '-':
                System.out.println("Разность двух чисел: " + (this.firstNum - this.secondNum));
                break;
            case '*':
                System.out.println("Произведение двух чисел: " + ((long) this.firstNum * (long) this.secondNum));
                break;
            case '/':
                System.out.println("Частное двух чисел: " + ((double) this.firstNum / (double) this.secondNum));
                break;
            case '^':
                for (int i = 0; i < this.secondNum; i++) {
                    resultLong *= this.firstNum;
                }
                System.out.println("Возведение в сепень: " + resultLong);
                break;
            case '%':
                System.out.println("Остаток от деления двух чисел: " + (this.firstNum % this.secondNum));
                break;
            default:
                System.out.println("Неправильный формат ввода символа математической операции!");
        }
    }
}
