package com.max.idea;

import java.util.Scanner;

public class Summary4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        Scanner scanner = new Scanner(System.in);
        String answerFromUser = ""; // ответ пользователя
        String answerFromSystem = "Заархивированный вирус"; // правильный ответ в системе
        int attemptMax = 3; // максимальное количество попыток
        int step = 1; // перевод на следующую попытку

        for (int attempt = 1; attempt <= attemptMax; attempt += step) {
            answerFromUser = scanner.nextLine();

            int replyType = checkReplyType(answerFromUser); // пользователь ввёл "Подсказка" или ответ на загадку. 10 - ответ, 20 - подсказка
            int answerCheck = checkAnswer(answerFromUser, answerFromSystem); // проверить ответ пользователя

            if (answerCheck == 0) { // пользователь ввёл правильный ответ
                System.out.println("Правильно!");
                break;
            }

            if (attempt == 1 && replyType == 20) { // пользователь запросил подсказку на 1-ой попытке
                System.out.println("Ты же айтишник! Думай по-айтишному!");
                step = 0;
                continue;
            } else if (attempt != 1 && replyType == 20) { // пользователь запросил подсказку на 2-ой или 3-ей попытке
                System.out.println("Подсказка уже недоступна");
                step = 0;
                continue;
            }

            if (replyType == 10 && (attempt == 1 || attempt == 2) && answerCheck != 0) { // пользователь ввёл неправильный ответ на 1-ой и 2-ой попытке
                System.out.println("Подумай ещё!");
                step = 1;
                continue;
            }
            if (replyType == 10 && attempt == 3 && answerCheck != 0) { // пользователь ввёл неправильный ответ 3 раза
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }

    private static int checkAnswer(String answerUser, String answerCorrect) {
        return answerCorrect.compareToIgnoreCase(answerUser);
    }

    private static int checkReplyType (String replyUser) {
        String tip = "Подсказка";
        return (replyUser.compareToIgnoreCase(tip) == 0) ? 20 : 10; // 10 - ответ, 20 - подсказка
    }
}
