package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static void calculate(int firstNum, int secondNum, char operator) {
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
                System.out.println("Возведение в сепень: " + (long) Math.pow(firstNum, secondNum));
                break;
            case '%':
                System.out.println("Остаток от деления двух чисел: " + (firstNum % secondNum));
                break;
            default:
                System.out.println("Неправильный формат ввода символа математической операции!");
        }
    }
}
