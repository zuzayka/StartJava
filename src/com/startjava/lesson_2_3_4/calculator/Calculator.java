package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static String calculate(String expressionString) {
            String[] expression = expressionString.split(" ");
            int firstNumber;
            try {
                firstNumber = Integer.parseInt(expression[0]);
            } catch (NumberFormatException e) {
                return "Неправильный формат ввода первого числа!";
            }
            int secondNumber;
            try {
                secondNumber = Integer.parseInt(expression[2]);
            } catch (NumberFormatException e) {
                return "Неправильный формат ввода второго числа!";
            }
            if (firstNumber < 0 || secondNumber < 0) {
                return "Вычисления производятся только над неотрицательными числами!";
            }
            char operator = expression[1].charAt(0);
            String result;
            switch (operator) {
                case '+':
                    result = "Сумма двух чисел: ".concat(String.valueOf(firstNumber + secondNumber));
                    break;
                case '-':
                    result = "Разность двух чисел: ".concat(String.valueOf(firstNumber - secondNumber));
                    break;
                case '*':
                    result = "Произведение двух чисел: ".concat(String.valueOf((long) firstNumber * (long) secondNumber));
                    break;
                case '/':
                    result = "Частное двух чисел: ".concat(String.valueOf((double) firstNumber / (double) secondNumber));
                    break;
                case '^':
                    result = "Возведение в сепень: ".concat(String.valueOf((long) Math.pow(firstNumber, secondNumber)));
                    break;
                case '%':
                    result = "Остаток от деления двух чисел: ".concat(String.valueOf(firstNumber % secondNumber));
                    break;
                default:
                    result = "Неправильный формат ввода символа математической операции!";
            }
        return result;
    }

}
