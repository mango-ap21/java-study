package com.max.idea;

import java.util.Scanner;
import java.util.Arrays;

public class Summary3 {
    public static void main(String[] args) {
//        Пользователь вводит количество строк n
        System.out.println("Введите количество строк:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        Пользователь вводит строки
        System.out.println("Введите строки через Enter:");
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
//        Найти строку с максимальным количеством разных символов
        Integer [] charCountArr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            String uniqueChars = "";
            String str = arr[i];
            for (char ch : str.toCharArray()) {
                if (uniqueChars.indexOf(ch) == -1) {
                    uniqueChars += ch;
                }
            }
            charCountArr[i] = uniqueChars.length();
        }
        int charUniqueMax = 0;
        for (int index : charCountArr) {
            charUniqueMax = Math.max(charUniqueMax, index);
        }
        int indexMax = Arrays.asList(charCountArr).indexOf(charUniqueMax);
//        Вывод ответа
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Строка " + (i + 1) + ": " + arr[i]);
        }
        System.out.println("Ответ: " + arr[indexMax]);
    }
}
