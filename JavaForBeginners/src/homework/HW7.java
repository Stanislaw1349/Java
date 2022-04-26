package homework;

import java.util.Arrays;
import java.util.stream.Stream;

public class HW7 {
    public static void task(int n) {
        System.out.println("Task " + n);
        n++;
    }

    public static void line() {
        System.out.println("________________________");
    }

    public static double getMidValue(int[] array) {
        double midValue = 0.0;
        for (int i = 0; i < array.length; i++) {
            midValue += array[i];
        }
        return midValue / array.length;
    }

    public static int[] getTask21arr(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int aver;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        aver = sum / arr.length;

        int[] array = {min, max, aver};

        return array;
    }

    public static void main(String[] args) {

        task(1);
        //Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

        String[] catsNames = {
                "Behemoth",
                "Кот",
                "Gorgoroth",
                "Пушистик",
                "Звонок",
                "Прыгунок",
                "Полосатик",
                "Мурзик"
        };
        Stream.of(catsNames).forEach(System.out::println);
        line();

        task(2);
        //В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”, а значение элемента с индексом 1 на “Черныш”.
        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";
        Stream.of(catsNames).forEach(System.out::println);
        line();

        task(3);
        // Создать массив catsColors и заполнить его значениями.
        String[] catsColors = {
                "gray",
                "black",
                "gray",
                "gray",
                "red",
                "gray",
                "red",
                "gray"
        };
        System.out.println(Arrays.toString(catsColors));
        line();

        task(4);
        // Создать массив catsAges и заполнить его любыми значениями.
        int[] catsAges = {1, 3, 5, 4, 2, 6, 8};
        System.out.println(Arrays.toString(catsAges));

        task(5);
        // Создать массив isCatRed и заполнить его соответствующими значениями
        boolean[] isCatRed = new boolean[catsColors.length];
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("red")) {
                System.out.println(isCatRed[i] = true);
            } else {
                System.out.println(isCatRed[i] = false);
            }
        }
        line();

        task(6);
       /* Распечатать для массивов catsNames и catsColors:
        имя кота в коробке с номером 6
        имена котов из коробок с четными индексами
        имена котов из коробок, чьи индексы кратны 4
        цвет котов из коробок с нечетными индексами
        цвет котов из коробок, чьи индексы кратны 3*/

        System.out.println("Имя " + catsNames[6]);
        line();

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        line();

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        line();

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }
        line();

        for (int i = 3; i < catsColors.length; i += 3) {
            System.out.println(catsColors[i]);
        }
        line();

        task(7);
        //Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("gray")) {
                System.out.println("Накорми кота!");
            }
        }
        line();


        task(8);
        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота " + catsNames[i] + " на прививку!");
            }
        }
        line();

        task(9);
        //Для кота в последней коробке распечатать имя, цвет, возраст
        if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {

        }
       /* for (int i = 0; i < catsNames.length; i++) {

            if (i == (catsNames.length - 1)) {
                System.out.println(catsNames[i] + catsColors[i] + catsAges[i]);
            }


        }*/
        line();

        task(10);
        //Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }/**/
        }
        line();

        task(11);
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
        }

        /**/
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] == true && catsNames[i].equals("Рыжик")) {
                System.out.println("Накорми кота! " + catsNames[i]);
            }
        }

        line();

        task(12);
        //Распечатать средний возраст котов из массива catsAges
        double sum12 = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum12 = sum12 + catsAges[i];
        }
        System.out.printf("%.2f", sum12 / catsAges.length);
        System.out.println();
        line();

        task(13);
        //Распечатать возраст самого молодого кота
        if (catsAges == null || catsAges.length == 0) {
            System.out.println("Error");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);
        line();

        task(14);
        //Распечатать возраст самого старого кота
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);
        line();

        task(15);
        //Распечатать количество серых котов
        int counter = 0;
        if (catsColors == null || catsColors.length == 0) {
            System.out.println("Error");
        }
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("gray")) {
                counter++;
            }
        }
        System.out.println(counter + " серых котов");
        line();

        task(16);
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        if (catsNames.length == catsAges.length && catsAges.length != 0) {
        }
        for (int i = 0; i < catsAges.length; i++) {
            if (i % 2 == 0 && catsAges[i] <= 3) {
                System.out.println("Кот " + catsNames[i]);
            }
        }
        line();

        task(17);
        //Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)
        int count = 0;
        for (int i = 0; i <= 10; i += 2) {
            count++;
        }

        int[] array = new int[count];

        for (int i = 0, j = 0; i < array.length; i++, j += 2) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        line();

        task(18);
        //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        //Проверить работу метода тестом, если параметр - массив catsAges
        System.out.println(Arrays.toString(catsAges));
        System.out.printf("%.2f", getMidValue(catsAges));
        System.out.println();
        line();

        task(19);
        //Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900.

        for (int i = -999; i < -900; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        line();

        task(20);
        //Создать массив из 10 случайных положительных целых чисел
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ((int) (Math.random() * Integer.MAX_VALUE));
            System.out.print(randomArray[i] + " ");
            System.out.println();
        }
        line();

        task(21);
        //Создать метод, который принимает на вход массив int, и возвращает минимальное значение,
        //максимальное значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
        System.out.println(Arrays.toString(getTask21arr(array)));
        int[] test21 = getTask21arr(randomArray);
        for (int i = 0; i < test21.length; i++) {
            System.out.print(test21[i] + " ");
        }
        System.out.println();
        line();

        task(22);
        //Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        int evenLength = 0;
        int oddLength = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                evenLength++;
            } else {
                oddLength++;
            }
        }
        int[] even = new int[evenLength];
        int[] odd = new int[oddLength];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                even[evenCount] = randomArray[i];
                evenCount++;
            } else {
                odd[oddCount] = randomArray[i];
                oddCount++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
        line();

        task(23);
        //Создать двумерный массив, который состоит из имен, возрастов, цветов котов:



    }
}
