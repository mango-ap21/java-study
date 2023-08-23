package com.max.idea;

import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
//        1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        String numToStr = Integer.toString(scanner.nextInt());
//        2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Введите второе число: ");
        int numToInt = scanner.nextInt();
//        3. Сравнить 2 числа и вывести большее на экран
        System.out.println(Math.max(Integer.parseInt(numToStr), numToInt));
//        4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        System.out.println((double) Math.min(Integer.parseInt(numToStr), numToInt));
    }
}
