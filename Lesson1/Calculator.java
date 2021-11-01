import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        String annotation = "\tВнимание!!!\n Консольный java калькулятор выводит в консоль результат"
                + "\nматематической операции над двумя положительными натуральными"
                + "\nнатуральными числами. Знак математической операции (+ сложение, - вычитание,"
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
            int secondNum = 0;
            if (scanner.hasNextInt()) {
                secondNum = scanner.nextInt();
            } else {
                System.out.println("Неправильный формат ввода второго числа!");
                continue;
            }

            long resultLong;
            System.out.println("Введите символ математической операции");
            String temp = scanner.nextLine();
            String operator = scanner.nextLine();
            if (operator.equals("+")) {
                System.out.println("Сумма двух чисел: " + (firstNum + secondNum));
                continue;
            } else if (operator.equals("-")) {
                System.out.println("Разность двух чисел: " + (firstNum - secondNum));
                continue;
            } else if (operator.equals("*")) {
                resultLong = firstNum * secondNum;
                System.out.println("Произведение двух чисел: " + ((long) firstNum * (long) secondNum));
                continue;
            } else if (operator.equals("/")) {
                System.out.println("Частное двух чисел: " + ((double) firstNum / (double) secondNum));
                continue;
            } else if (operator.equals("^")) {
                resultLong = 1;
                for(int i = 0; i < secondNum; i++) {
                    resultLong *= firstNum;
                }
                System.out.println("Возведение в сепень: " + resultLong);
                continue;
            } else if (operator.equals("%")) {
                System.out.println("Остаток от деления двух чисел: " + (firstNum % secondNum));
                continue;
            } else {
                System.out.println("Неправильный формат ввода символа математической операции!");
                continue;
            }
        }
    }
}