package com.max.idea;

public class Data2 {
    public static void main(String[] args) {
        checkStr("I like Java!!!");
    }
    private static void checkStr(String str) {
//        1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        Boolean result1 = str.contains("Java");
//        2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        Boolean result2 = str.startsWith("I like");
//        3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        Boolean result3 = str.endsWith("!!!");
//        4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (result1 && result2 && result3) {
            System.out.println(str.toUpperCase());
        }
//        5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        System.out.println(str.replace("a", "o").substring(7,11));
    }
}
