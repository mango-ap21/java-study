package com.max.idea;

import java.util.Scanner;

public class Summary2 {
    public static void main(String[] args) {
        System.out.println("Введите уравнение из 5 символов без пробелов:");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        Character a = equation.charAt(0),
                sign = equation.charAt(1),
                b = equation.charAt(2),
                y = equation.charAt(4),
                x = 'x';
        int unknown;
        if (a == x) {
//            x = y - b (если +), x = y + b (если -)
            unknown = ("+".compareTo(sign.toString()) == 0) ?
                    Character.getNumericValue(y) - Character.getNumericValue(b) :
                    Character.getNumericValue(y) + Character.getNumericValue(b);
        } else if (b == x) {
//            x = y - a (если +), x = a - y (если -)
            unknown = ("+".compareTo(sign.toString()) == 0) ?
                    Character.getNumericValue(y) - Character.getNumericValue(a) :
                    Character.getNumericValue(a) - Character.getNumericValue(y);
        } else {
//            x = a + b (если +), x = a - b (если -)
            unknown = ("+".compareTo(sign.toString()) == 0) ?
                    Character.getNumericValue(a) + Character.getNumericValue(b) :
                    Character.getNumericValue(a) - Character.getNumericValue(b);
        }
        System.out.println("Уравнение: " + equation);
        System.out.println("Ответ: x=" + unknown);
    }
}
