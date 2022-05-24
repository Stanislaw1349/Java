package homework;

import java.util.Locale;

public class HW10 {
    //Написать метод, который принимает на вход строку.
//Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
//Догадаться, каким методом из видео можно проверить, были ли пробелы.
//Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//Если пробелов не было, вернуть сообщение “Пробелов не было”.
//Если строка пустая, вернуть сообщение “Строка пустая”.
//
//Test Data:
//“    QA4Everyone   “ → “Лишние пробелы удалены”
//“QA4Everyone“ → “Пробелов не было”
//“” → “Строка пустая”
    public static String stringSpace(String str) {
        if (!str.isEmpty()) {
            String str1 = str.trim();
            if (str.length() != str1.length()) {

                return "Лишние пробелы удалены";
            } else {

                return "Пробелов не было";
            }
        } else {
            return "Строка пустая";
        }
    }

//Написать алгоритм RemoveAlla.
//С помощью методов ,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
//Test Data:
// “    QA4Everyone   “ →  “QA4Everyone“
//“panda   “ → “pnd”

    public static String removeAlla(String str) {
        if (!str.isEmpty()) {

            str.trim();

            return str.trim().replace("a", "");
        } else {

            return "Строка пустая";
        }
    }

//Написать алгоритм RemoveAllZeros.
//С помощью методов,  написать алгоритм, который принимает на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
//Test Data:
// “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//“ 0000000111“ → “111”

    public static String removeAllZeros(String str) {

        if (!str.isEmpty()) {

            str.trim();

            return str.trim().replace("0", "");
        } else {

            return "Строка пустая";
        }
    }
//Написать алгоритм RemoveAllSpaces.
//С помощью методов,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
//Test Data:
// “    QA   4  Everyone   “ →  “QA4Everyone“
//“p a     n d a   “ → “panda”

    public static String RemoveAllSpaces(String str) {

        if (!str.isEmpty()) {

            str.trim();

            return str.trim().replace(" ", "");
        } else {

            return "Строка пустая";
        }
    }

//Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
//Test Data:
//“Abracadabra” → 5
//“Homenum Revelio” → 0

    public static int howManyA(String str) {

        if (!str.isEmpty()) {
            str.trim();
            String str1 = str.toLowerCase().replace("a", "");

            return str.length() - str1.length();
        } else {

            return 0;
        }
    }

//Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
//Test Data:
//“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current
// long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8
// LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates
// for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still
// receiving security and other upgrades.” → true
//
//“As a decrepit father takes delight
//To see his active child do deeds of youth,
//So I, made lame by fortune’s dearest spite,
//Take all my comfort of thy worth and truth.
//For whether beauty, birth, or wealth, or wit,
//Or any of these all, or all, or more,
//Entitled in thy parts do crownèd sit,
//I make my love engrafted to this store.
//So then I am not lame, poor, nor despised,
//Whilst that this shadow doth such substance give
//That I in thy abundance am sufficed,
//And by a part of all thy glory live.
//Look what is best, that best I wish in thee.
//This wish I have; then ten times happy me.” → false

    public static boolean containsJava(String str) {

        return str.contains("Java");
    }

//Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
// точку и кавычки в конце строки с помощью метода concat()
//Test Data:
//“One” → ““One.””
//“    TWO  “ → ““TWO.””

    public static String quotesDot(String str) {
        if (!str.isEmpty()) {
            String str1 = "\"";

            return str1.concat(str.trim().concat(".\""));
        } else {

            return "Строка пустая";
        }
    }

//Напишите метод, который принимает на вход название города и исправляет написание:
//Test Data:
//“ташкент” → “Ташкент”
//“ЧикаГО” → “Чикаго”

    public static String fixError(String str) {
        if (!str.isEmpty()) {
            String string = str.trim().substring(0, 1).toUpperCase();

            return string.concat(str.substring(1).trim().toLowerCase());

        } else {

            return "Строка пустая";
        }
    }



}
