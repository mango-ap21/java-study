package com.max.idea;

import java.util.Scanner;

public class Summary1 {
    public static void main(String[] args) {
//        Пользователь вводит текущий курс и количество рублей.
        System.out.println("Введите текущий курс доллара:");
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = scanner.nextDouble();
        System.out.println("Введите количество рублей для перевода:");
        double amountToConvert = scanner.nextDouble();
//        Программа переводит рубли в доллары по текущему курсу с округлением до 2-х знаков после запятой.
        String amountConverted = String.format("%.2f", convert(exchangeRate, amountToConvert));
        System.out.println("Курс доллара: " + exchangeRate + "\n"
        + "Количество рублей: " + amountToConvert + "\n"
        + "Итого: " + amountConverted + " $");
    }
    private static double convert(double rate, double amount) {
        return amount / rate;
    }
}
