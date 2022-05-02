package homework.hw8;
//Импортировать статичные методы класса Utils, которые вы будете использовать во время выполнения HW8

import java.util.Arrays;
//4
import static utils.Utils.*;

public class HW8 {

    // 5 Создать объекты типа Integer, Double, String и присвоить им такие же значения, как и переменным класса HW8_1
    static Integer q = 20;
    static Double d = 4.8;
    static String str = "Java";

    //6
    public static void printSpreadsheetT() {
        line();
        System.out.println("| HW8      |" + " HW8_1    " + "| true or false        |");
    }

    public static void printSpreadsheet() {
        line();
        System.out.println("| Integer q = " + q + "     | Integer q1 = " + HW8_1.q1 + "   |" + q.equals(HW8_1.q1) + "|");
        line();
        System.out.println("| Double d = " + d + "     | Double d1 = " + HW8_1.d1 + "  |" + d.equals(HW8_1.d1) + "|");
        line();
        System.out.println("| String str = " + str + "  | String str = " + HW8_1.str1 + "|" + str.equals(HW8_1.str1) + "|");
        line();
    }

    //7
    public static int[] createArray(int a, int b, int c, int d, int e) {
        return new int[]{a, b, c, d, e};
    }

    //8
    public static double[] createArray(double a, double b, double c, double d, double e) {
        return new double[]{a, b, c, d, e};

    }

    //9
    public static String[] createArray(String a, String b, String c, String d, String e) {
        return new String[]{a, b, c, d, e};
    }

    //10
    public static double[] getIntArrMult(int[] arr) {
        if (nullArray(arr) && containNegative(arr)) {
            return null;
        }

        double[] res = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = (arr[i] * 2.5);
        }
        return res;
    }

    //11
    public static int getEvenArray(int[] arr) {
        if (nullArray(arr) && containNegative(arr)) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //12
    public static int[] returnOddArray(int[] arr) {
        if (nullArray(arr) && containNegative(arr)) {
            return null;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] arrO = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arrO[j] = arr[i];
                j++;
            }
        }

        return arrO;
    }

    public static int[] returnEvenArray(int[] arr) {
        if (nullArray(arr) && containNegative(arr)) {
            return null;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] arrE = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrE[j] = arr[i];
                j++;
            }
        }

        return arrE;
    }


    //13
    public static boolean[] getBooleanArray(int[] arr) {
       /* if (nullArray(arr)) {
            return null;
        }*/
        boolean[] arrBoolean = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                arrBoolean[i] = true;
            } else {
                arrBoolean[i] = false;
            }
        }
        return arrBoolean;
    }

    //14
    public static String getStrArray(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    //15
    public static int getSum2HalfArray(int[] arr) {
        /*if (nullArray(arr)){
            return null;
        }*/
        int sum2half = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2half += arr[i];
        }
        return sum2half;
    }

    //16
    public static int[] returnMultiply(int a) {
        int[] arrMult = new int[11];
        if (a > 1 && a < 10) {
            for (int i = 0; i < arrMult.length; i++) {
                arrMult[i] = i * a;
            }
        }
        return arrMult;
    }

    //17

    public static int[] returnHalfLifeArray(int[] arr) {
      /*   if (nullArray(arr)) {
            return null;
        }*/
        if (countOddAray(arr) > countEvenAray(arr)) {
            return returnOddArray(arr);
        } else if (countOddAray(arr) < countEvenAray(arr)) {
            return returnEvenArray(arr);
        } else {
            return new int[]{};
        }
    }

    //18
    public static int[] generateRandomArr(int length) {
        if (length < 0) {
            return null;
        }
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        return array;
    }

    //19
    public static int[] generateArrayLD(int l, int d) {
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomIntArray((int) Math.pow(10, d - 1) * 10, (int) Math.pow(10, d - 1));
        }
        return arr;
    }

    //20
    public static int[] generateArray2symb(int[] arr) {

        int count = 0;

        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 9 && arr[i] < 100) {
                    count++;
                }
            }
        } else {
            return null;
        }

        int[] arr1 = new int[count];
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] < 100 && count1 < arr1.length) {
                arr1[count1] = arr[i];
                count1++;
            }
        }
        return arr1;
    }

    // 21
    public static int[] generateArrDecEd(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // arr[i] = array[i] / 10 * 10 - array[i] % 10;
            arr[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }
        return arr;
    }

    //22
    public static String[] getArrPhoneNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        String[] number = new String[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                number[0] = "\"" + arr[0] + "(" + +arr[1] + arr[2] + arr[3] + ")" + arr[4] + arr[5] + arr[6] + arr[7]
                        + arr[8] + arr[9] + arr[10] + "\"";

                if (arr[0] == 1) {
                    number[1] = "\"USA\"";
                } else if (arr[0] == 2) {
                    number[1] = "\"Egypt\"";
                } else if (arr[0] == 3) {
                    number[1] = "\"European Union\"";
                } else if (arr[0] == 4) {
                    number[1] = "\"Romania\"";
                } else if (arr[0] == 5) {
                    number[1] = "\"Falkland Islands\"";
                } else if (arr[0] == 6) {
                    number[1] = "\"Malaysia\"";
                } else if (arr[0] == 7) {
                    number[1] = "\"Russia\"";
                } else if (arr[0] == 8) {
                    number[1] = "\"Japan\"";
                } else if (arr[0] == 9) {
                    number[1] = "\"Turkey\"";
                } else {
                    return null;
                }

            }

        }
        return number;
    }

    //23
    public static int[] getUniqueArray(int[] arr) {
        if (containNegative(arr)) {
            return null;
        }
        int[] unic = {};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        unic = new int[(arr.length - count)];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                unic[count] = arr[i];
                count++;
            }
        }
        return unic;
    }

    //24
    public static int[] getUniqueAndNotCount(int[] arr) {
        int count = 0;

        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            arr[j] = -1;
                            count++;
                        }
                    }
                }
            }
            return new int[]{arr.length - count, count};
        }
        return new int[]{};
    }

    public static int[] getArrayBetweenIndex(){


    }

    public static void main(String[] args) {


        task(6);
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
        //HW8	 		|HW8_1			|areEquals?
        //____________________________________________
        //Double d = …	|Double d_1 = …		| true or false
        printSpreadsheetT();
        printSpreadsheet();

        task(7);
        // Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(createArray(20, 1, 2, 2, 3)));
        line();

        task(8);
        //Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(createArray(2.3, 34.5, 4.6, 8.2, 9.5)));
        line();

        task(9);
        //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(Arrays.toString(createArray("Каждый", "Охотник", "Желает", "Знать", "Где")));
        line();

        task(10);
        //Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же чисел, умноженных на 2.5
        System.out.println(Arrays.toString(getIntArrMult(randomIntArrayL(10, 30, 1))));
        line();

        task(11);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве

        int[] arr11 = randomIntArrayL(10, 40, 1);
        System.out.println(getEvenArray(arr11));
        line();

        task(12);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив нечетных чисел

        int[] arr12 = randomIntArrayL(10, 30, 1);
        System.out.println(Arrays.toString(returnOddArray(arr12)));
        line();

        task(13);
        //Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив значений true или false, если числа больше 10

        int[] arr13 = {1, 21, 3, 42, 5, 6};
        System.out.println(Arrays.toString(getBooleanArray(arr13)));
        line();

        task(14);
        //Написать метод, который принимает на вход массив слов,
        // и возвращает строку, состоящую из этих слов

        String[] arr14 = {"В", "коллекциях", "мы", "всегда", "работаем", "через", "интерфейсы"};
        System.out.println(getStrArray(arr14));
        line();

        task(15);
        //Написать метод, который принимает массив целых чисел
        // и считает сумму чисел во второй половине массива
        int[] arr15 = {1, 21, 3, 42, 5, 6};
        System.out.println(getSum2HalfArray(arr15));
        line();

        task(16);
        //Написать метод, который принимает на вход целое положительные число
        // в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        int t16 = 3;
        System.out.println(Arrays.toString(returnMultiply(t16)));
        line();

        task(17);
        //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
        // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.

        int[] arr17 = {1, 2, 3, 5, 7, 8, 9};
        int[] arr171 = {11, 2, 4, 5, 7, 10};

        System.out.println(Arrays.toString(returnHalfLifeArray(arr171)));
        System.out.println(countEvenAray(arr17));
        System.out.println(countOddAray(arr171));
        line();

        task(18);
        //Написать метод, который принимает на вход длину массива и
        // генерирует массив случайных положительных чисел от 0 до 100 исключительно.
        System.out.println(Arrays.toString(generateRandomArr(10)));
        line();

        task(19);
        //Написать метод, который принимает на вход длину массива l и количество знаков d
        // (однозначные, двузначные, трехзначные и тд числа)
        // и генерирует массив случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d
        System.out.println(Arrays.toString(generateArrayLD(10, 2)));
        line();

        task(20);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив только двузначных чисел. Проверить работу метода на массиве из задания 18.
        System.out.println(Arrays.toString(generateArray2symb(generateRandomArr(15))));
        line();

        task(21);
        //Написать метод, который принимает на вход массив целых положительных двузначных чисел,
        // и возвращает массив разниц между десятками и единицами
        int[] arr21 = {21, 19, 78, 46, 52, 93};
        System.out.println(Arrays.toString(generateArrDecEd(arr21)));
        line();

        task(22);
        //Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
        // который содержит номер телефона, состоящий из этих чисел, и название страны, которой номер принадлежит.
        //Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
        int[] arr22 = {4, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(getArrPhoneNum(arr22)));
        line();

        task(23);
        //Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив
        //уникальных чисел.
        int[] arr23 = {1, 33, 4, 44, 5, 5, 5, 6, 7, 8, 88, 88};
        System.out.println(Arrays.toString(getUniqueArray(arr23)));
        line();

        task(24);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        //и возвращает количество уникальных и неуникальных элементов в этом массиве
        System.out.println(Arrays.toString(getUniqueAndNotCount(arr23)));
        line();

        task(25);
        //Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительных
        //числа(значения индексов). Метод возвращает массив, который содержит только числа из первого массива в промежутке
        //между индексами.
        //Например:
        //method({1, 2, 3, 4, 5}, 1, 3) ->{2, 3, 4}


    }

}
