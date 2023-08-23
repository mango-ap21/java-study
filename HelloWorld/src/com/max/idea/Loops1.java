package com.max.idea;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
//        1. Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        double[] arr = new double[arrSize];
        System.out.println("Введите данные массива через Enter: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextDouble();
        }
//        2. Сравнить элементы массива с заранее заданными константами x, y, z.
        double x = 3,
                y = 4,
                z = 5;
//        3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        for (int i = 0; i < arrSize; i ++) {
            if (arr[i] == x || arr[i] == y || arr[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
