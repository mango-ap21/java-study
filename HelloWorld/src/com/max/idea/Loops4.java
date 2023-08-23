package com.max.idea;

import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит данные с клавиатуры в матрицу. Размерность матрицы задается пользователем.
        System.out.println("Введите размерность матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        double[][] matrix = new double[dimension][dimension];
        System.out.println("Введите данные в матрицу через Enter: ");
        for (int i = 0; i < dimension; i ++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
//        После этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
        for (int i = 0; i < 1; i ++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("%.1f ", matrix[i][j] * 3);
            }
        }
    }
}
