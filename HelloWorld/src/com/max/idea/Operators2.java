package com.max.idea;

import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
//        1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        System.out.println("Введите 2 числа через Enter:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /):");
        String symbol = scanner.next();
//        2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        String calcResult;
        switch (symbol) {
            case "+":
                calcResult = String.valueOf((a + b));
                break;
            case "-":
                calcResult = String.valueOf((a - b));
                break;
            case "*":
                calcResult = String.valueOf((a * b));
                break;
            case "/":
                if (b == 0) {
                    calcResult = "На 0 делить нельзя";
                }
                else calcResult = String.valueOf((a / b));
                break;
            default:
                calcResult = "Введён некорректный символ либо символ не введён вовсе. Вычисления не выполнены.";
        }
        System.out.println(calcResult);
    }

}
