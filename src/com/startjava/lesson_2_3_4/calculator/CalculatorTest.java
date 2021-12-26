package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        String annotation = "\tВнимание!!!\n Консольный java калькулятор выводит в консоль результат математической"
                + "\nоперации над двумя натуральными числами, в подмножество натуральных чисел"
                + "\nдобавлен ноль. Знак математической операции: + сложение, - вычитание,"
                + "\n* умножение, / деление, ^ возведение в степень, % вычисление"
                + "\nостатка от деления целых чисел."
                + "\nОграничение: результат вычисления не должен превышать 9*10^18.\n\n";
        System.out.println(annotation);
        Scanner scanner = new Scanner(System.in);
        String calculatorClosure = "yes";
        while (calculatorClosure.equals("yes")) {
            System.out.println("Введите математическое выражение: ");
            String[] expression;
            expression = scanner.nextLine().split(" ");
            int firstNumber;
            try {
                firstNumber = Integer.parseInt(expression[0]);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода первого числа!");
                continue;
            }
            int secondNumber;
            try {
                secondNumber = Integer.parseInt(expression[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода второго числа!");
                continue;
            }
            if (firstNumber < 0 || secondNumber < 0) {
                System.out.println("Вычисления производятся тольео над неотрицательными числами!");
                continue;
            }
            char operator = expression[1].charAt(0);
            Calculator.calculate(firstNumber, secondNumber, operator);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                calculatorClosure = scanner.nextLine();
            }
            while (!calculatorClosure.equals("yes") && !calculatorClosure.equals("no"));
        }
    }
}