package com.max.idea;

public class Arrays {
    public static void main(String[] args) {
//        1. Задайте массив из 5 любых целых чисел
        int [] intArray = {10, 20, 30, 40, 50};
//        2. Поменяйте местами первый и последний элемент в массиве
        int firstElement = intArray[0];
        intArray[0] = intArray[intArray.length - 1];
        intArray[intArray.length - 1] = firstElement;
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
//        3. Вывести в консоль результат суммы первого и среднего элемента
        int sum = intArray[0] + intArray[intArray.length/2];
        System.out.print("\nСумма первого и среднего элемента: " + sum);
    }
}
