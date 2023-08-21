package com.max.idea;

import java.util.Scanner;

public class Operators3 {
    public static void main(String[] args) {
//        1. Пользователю предлагается на выбор ввести массу или расстояние.
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner = new Scanner(System.in);
        int weightDistance = scanner.nextInt();

//        2. Пользователю предлагается выбрать единицу измерения.
        String chooseMeasure = (weightDistance == 1) ? "1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна" : "1 - метр, 2 - миля, 3 - ярд, 4 - фут";
        System.out.println("Выберите единицу измерения: " + chooseMeasure);
        int measure = scanner.nextInt();

//        3. Пользователю предлагается ввести количество выбранных единиц
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        String result = (weightDistance == 1) ? getWeight(measure, number) : getDistance(measure, number);
        System.out.println(result);
    }

    private static String getWeight(int measure, int number) {
        double grams = 0, kilos = 0, centners = 0, tons = 0;
        switch (measure) {
            case 1:
                grams = number;
                kilos = grams / 1000;
                centners = grams / 100000;
                tons = grams / 1000000;
                break;
            case 2:
                kilos = number;
                grams = kilos * 1000;
                centners = kilos / 100;
                tons = kilos / 1000;
                break;
            case 3:
                centners = number;
                grams = centners * 100000;
                kilos = centners * 100;
                tons = centners / 10;
                break;
            case 4:
                tons = number;
                grams = tons * 1000000;
                kilos = tons * 1000;
                centners = tons * 10;
                break;
            default:
                break;
        }

        String result = "Результат:\n"
                + "Граммы: " + grams + "\n"
                + "Килограммы: " + kilos + "\n"
                + "Центнеры: " + centners + "\n"
                + "Тонны: " + tons;
        return result;
    }
    private static String getDistance(int measure, int number) {
        double meters = 0, miles = 0, yards = 0, feet = 0;
        switch (measure) {
            case 1:
                meters = number;
                miles = meters / 1609;
                yards = meters * 1.094;
                feet = meters * 3.281;
                break;
            case 2:
                miles = number;
                meters = miles * 1609;
                yards = miles * 1760;
                feet = miles * 5280;
                break;
            case 3:
                yards = number;
                meters = yards / 1.094;
                miles = yards / 1760;
                feet = yards * 3;
                break;
            case 4:
                feet = number;
                meters = feet / 3.281;
                miles = feet / 5280;
                yards =  feet / 3;
                break;
            default:
                break;
        }

        String result = "Результат:\n"
                + "Метры: " + meters + "\n"
                + "Мили: " + miles + "\n"
                + "Ярды: " + yards + "\n"
                + "Футы: " + feet;
        return result;
    }
}
