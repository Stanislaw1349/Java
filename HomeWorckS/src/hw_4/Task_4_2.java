package hw_4;

public class Task_4_2 {
    public static void main(String[] args) {
        System.out.println("Задача №1");

        /*Дана строка
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)*/

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            if ('о' == s.charAt(i)) {
                System.out.print(s.charAt(i));
            }
        }

        System.out.println(" ");
        System.out.println("Задача №2");

        /*Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.*/

        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++){
            if ('е' == s2.charAt(i)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("Задача №3");

       /* Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.*/
        String s3 = "Посмотрите как Рите нравится ритм";

        s3 = s3.toLowerCase();
        String sub = "рит";

        for (int i = 0; i < s3.length() - sub.length(); i++) {
            if (s3.substring(i, i + sub.length()).equals(sub)) {
                System.out.println((i));
            }
        }

        System.out.println("Экстра задача");

        /*Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"Java"}};
        int countExtr = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                countExtr++;
                }
            }
        }
        System.out.println(countExtr);
    }

}


















