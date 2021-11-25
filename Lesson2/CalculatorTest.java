import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        String annotation = "\tВнимание!!!\n Консольный java калькулятор выводит в консоль результат"
                + "\nматематической операции над двумя положительными натуральными"
                + "\nчислами. Знак математической операции: + сложение, - вычитание,"
                + "\n* умножение, / деление, ^ возведение в степень, % вычисление"
                + "\nостатка от деления целых чисел."
                + "\nОграничение: результат вычисления не должен превышать 9*10^18.\n\n";
        System.out.println(annotation);
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        int firstNumber;
        int secondNumber;
        char operator;
        while (true) {
            System.out.println("Введите первое число: ");
            try {
                firstNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат ввода первого числа!");
                continue;
            }
            calc.setFirstNum(firstNumber);

            System.out.println("Введите символ математической операции");
            operator = scanner.next().charAt(0);
            calc.setOperator(operator);

            // Для отсеивания последствий scanner.next().charAt(0)
            scanner.nextLine();
            System.out.println("Введите второе число: ");
            try {
                secondNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат ввода второго числа!");
                continue;
            }
            calc.setSecondNum(secondNumber);
            calc.calculate();
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                String calculatorClosure = scanner.nextLine();
                if (calculatorClosure.equals("yes")) {
                    break;
                } else if (calculatorClosure.equals("no")) {
                    return;
                } else {
                    continue;
                }
            }
        }
    }
}