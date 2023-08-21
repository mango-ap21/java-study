package com.max.idea;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
//        1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        System.out.println("Введите размер массива числом:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] arr = new double[size];
        System.out.println("Введите данные:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
//        2. Посчитайте среднее арифметическое элементов массива.
        double sum = 0, average = 0;
        for (double element : arr) {
            sum += element;
        }
        average = sum / size;
        System.out.println("Среднее арифметическое элементов массива равно " + average);
//        3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (double element : arr) {
            System.out.println(element + " * " + average + " = " + (element*average));
        }
    }
}
