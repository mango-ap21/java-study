package com.max.idea;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
//        1. Ввести три числа с клавиатуры x, y, z
        System.out.println("Введите 3 числа через Enter:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(),
                y = scanner.nextDouble(),
                z = scanner.nextDouble();
//        2. Найти и вывести в консоль среднее арифметическое этих чисел
        double average = average(x, y, z);
        System.out.println("Среднее арифметическое чисел " + x + ", " + y + ", " + z + " равно: " + average);
//        3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double averageDivided = Math.floor(average / 2);
//        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (averageDivided > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
    private static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
