import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        String annotation = "    Внимание!!!\n Консольный java калькулятор выводит в консоль результат"
                + "\nматематической операции над двумя положительными натуральными"
                + "\nнатуральными числами. знак математической операции (+ сложение, - вычитание,"
                + "\n* умножение, / деление, ^ возведение в степень, % вычисление"
                + "\nостатка от деления целых чисел), второе число."
                + "\nОграничение: результат вычисления не должен превышать 9*10^18.\n\n";
                //+ "\n\nВыйти из калькулятора: q затем Enter.";
                 System.out.println(annotation);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое число или q для выхода");
            String first = scanner.nextLine();
            if (first.equals("q")) {
                break;
            }
            int firstNum;
            try {
                firstNum = Integer.parseInt(first);
            } catch (NumberFormatException e) {  
                System.err.println("Неправильный формат ввода первого числа!");
                continue;
            }
            
            System.out.println("Введите второе число");
            String second = scanner.nextLine();
            int secondNum;
            try {
                secondNum = Integer.parseInt(second);
            } catch (NumberFormatException e) {  
                System.err.println("Неправильный формат ввода второго числа!");
                continue;
            }

            int result;
            long resultLong;
            double resultDouble;
            System.out.println("Введите символ математической операции");
            String operator = scanner.nextLine();
            if (operator.equals("+")) {
                result = firstNum + secondNum;
                System.out.println("Сумма двух чисел: " + result);
                continue;
            } else if (operator.equals("-")) {
                result = firstNum - secondNum;
                System.out.println("Разность двух чисел: " + result);
                continue;
            } else if (operator.equals("*")) {
                resultLong = firstNum * secondNum;
                System.out.println("Произведение двух чисел: " + resultLong);
                continue;
            } else if (operator.equals("/")) {
                resultDouble = (double) firstNum / (double) secondNum;
                System.out.println("Частное двух чисел: " + resultDouble);
                continue;
            } else if (operator.equals("^")) {
                resultLong = 1;
                for(int i = 0; i < secondNum; i++) {
                    resultLong *= firstNum;
                }
                System.out.println("Возведение в сепень: " + resultLong);
                continue;
            } else if (operator.equals("%")) {
                result = firstNum % secondNum;
                System.out.println("Остаток от деления двух чисел: " + result);
                continue;
            } else {
                System.out.println("Неправильный формат ввода символа математической операции!");
                continue;
            }
        }
    }
}