package com.max.idea;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное число n.
        System.out.println("Введите любое целое положительное число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число.");
            return;
        }
        else if (n == 0) {
            System.out.println("Вы ввели 0. Это число не имеет знака.");
            return;
        }
//        А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        int sum = 0;
        for (int i = 1; i <= n; i +=2) {
            sum += i;
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна " + sum);
    }
}
