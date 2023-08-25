package com.max.idea;

import java.util.concurrent.ThreadLocalRandom;

public class Data4 {
    public static void main(String[] args) {
//        Заполнить массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
        int sizeRow = 3,
                sizeColumn = 5;
        int randomMin = -20,
                randomMax = 20;
        int[][] matrix = new int[sizeRow][sizeColumn];
        int matrixMax = 0,
                matrixMin = 0;
        for (int i = 0; i < sizeRow; i ++) {
            for (int j = 0; j < sizeColumn; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(randomMin, randomMax);
                System.out.print(matrix[i][j] + " ");
                matrixMax = Math.max(matrixMax,matrix[i][j]);
                matrixMin = Math.min(matrixMin, matrix[i][j]);
            }
            System.out.println();
        }
//        1. Выведите максимальный и минимальный элемент массива.
        System.out.println("Максимальный элемент матрицы: " + matrixMax);
        System.out.println("Минимальный элемент матрицы: " + matrixMin);
//        2. Из максимального и минимального значения выведите наибольшее по модулю.
        System.out.println("Наибольшее значение по модулю между MIN и MAX: " + Math.max(Math.abs(matrixMax),Math.abs(matrixMin)));
    }
}
