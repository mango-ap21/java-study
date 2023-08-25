package com.max.idea;

import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
//        Пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
        System.out.println("Введите слова через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] wordsArr = words.split(" ");
//        1. Выведите слова, состоящие только из латиницы.
        int wordsCount = 0;
        for (String element : wordsArr) {
            if (element.matches("[a-zA-Z]+")) {
                wordsCount++;
                System.out.print(element + " ");
            }
        }
//        2. Выведите количество этих слов.
        System.out.println("\nКоличество слов, состоящих только из латиницы: " + wordsCount);
    }
}
