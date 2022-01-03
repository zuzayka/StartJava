package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        String annotation = "\tВнимание!!!\nКонсольный java калькулятор выводит в консоль результат математической"
                + "\nоперации над двумя натуральными числами, в подмножество натуральных чисел"
                + "\nдобавлен ноль. Знак математической операции: + сложение, - вычитание,"
                + "\n* умножение, / деление, ^ возведение в степень, % вычисление"
                + "\nостатка от деления целых чисел."
                + "\nОграничение: результат вычисления не должен превышать 9*10^18.\n\n";
        System.out.println(annotation);
        Scanner scanner = new Scanner(System.in);
        String calculatorTerminating = "yes";
        while (calculatorTerminating.equals("yes")) {
            System.out.println("Введите математическое выражение: ");
            System.out.println(Calculator.calculate(scanner.nextLine()));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                calculatorTerminating = scanner.nextLine();
            } while (!calculatorTerminating.equals("yes") && !calculatorTerminating.equals("no"));
        }
    }
}