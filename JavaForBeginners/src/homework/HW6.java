package homework;

public class HW6 {
    public static void task(int n) {
        System.out.println("Task " + n);
        n++;
    }

    public static void line() {
        System.out.println("________________________");
    }


    public static void main(String[] args) {


        task(1);
        //Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        line();

        task(2);
        // Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        line();

        task(3);
        //     Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();
        line();

        task(4);
        //     Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int i = 326; i >= 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        line();

        task(5);
        //     Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for (int i = 120; i <= 130; i += 1) {
            System.out.print(i / 10.0 + ",");

        }
        System.out.println();
        line();

        task(6);
        //      Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        line();

        task(7);
//Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        line();

        task(8);
        // Распечатать последовательность которая начинается с минимального значения типа данных short
        // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        line();
        task(9);
        //        Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        //        Числа, кратные 11, должны быть распечатаны синим цветом.
        //        Числа, кратные 12, должны быть распечатаны красным цветом.
        //        А ноль необходимо распечатать словом ZERO.

        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.println("\u001B[36m" + "ZERO");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i);
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i);
            }
        }
        System.out.print("\u001B[0m");
        System.out.println();

        for (int i = -10; i <= 34; i++) {
            if (i < 0) {
                System.out.print(i + ", ");
            } else if (i == 0) {
                System.out.print("\u001B[36m" + "ZERO" + ", ");
                System.out.print("\u001B[0m");
            } else if (i > 0 && i < 11) {
                System.out.print(i + ", ");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + ", ");
                System.out.print("\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + ", ");
                System.out.print("\u001B[0m");
            } else if (i > 12 && i < 22) {
                System.out.print(i + ", ");
                System.out.print("\u001B[0m");
            } else if (i == 23) {
                System.out.print(i + ", ");
            } else if (i > 23) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\u001B[0m");
        System.out.println();
        line();

        task(10);
        task10(-1.0, 5.0, 0.5);

        System.out.println();
        line();

        task(11);
        sequenceEven(8);
        System.out.println();
        line();

        task(12);
        degreeN(8);
        System.out.println();
        line();

        task(13);
        print9999();
        System.out.println();
        line();

        task(14);
        //Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        for (int i = 0; i < 6; i++) {
            System.out.print(i + ", ");
            if (i >= 1) {
                System.out.print(i * (-1) + ", ");
            }

        }
        System.out.println();
        line();

        task(15);
        //Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        line();

        task(16);
        sequenceOdd(2, 1, 10);
        System.out.println();
        line();

        task(17);
        sequence17(3);
        line();

        task(18);
        sequence18(3, 8);
        line();

        task(19);
        sequence19();
        line();

        task(19);
        sequence19();
        line();

        task(20);
        task20(1.3);
        line();
    }

    // Task 10
    //Написать метод, который принимает на вход параметры start, end, step,
    // и печатает последовательность десятичных чисел, начиная с числа start, с шагом step.
    // Точка выхода из цикла - число end.
    public static void task10(double start, double end, double step) {

        if (step == 0) {
            System.out.println("Error");
        } else if (start < end) {
            for (double i = start; i < end; i += step) {
                System.out.print(i + ", ");
            }

        } else if (start > end) {
            for (double i = start; i > end; i += step) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        line();


    }

    //Task 11
    //Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
    // Длина последовательности = l.
    public static void sequenceEven(int l) {
        int counter = 0;
        for (int i = 0; counter < l; i += 2) {
            System.out.print(i + ", ");
            counter++;
        }
    }

    //Task 12
    //Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void degreeN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%2.0f", Math.pow(2, i)));
        }
    }

    //Task 13
    // Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
    public static void print9999() {
        for (int i = 0; i < 10; i++) {
            System.out.print("" + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("" + i + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("" + i + i + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("" + i + i + i + i);
        }
    }

    // Task 16
    //Написать метод, который принимает параметры n, m, l,
    // и печатает последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l.
    public static void sequenceOdd(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Error, все числа четные");
        }
        int count = 0;
        for (int i = n; ; i += m) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + ", ");
            } else if (count == l) {
                break;
            }
        }
    }

    //Task 17
    // Сгенерируйте и распечатайте последовательность по формуле:
    // n + 1 = n + 2
    public static void sequence17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

    //Task 18
    // Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
    // начиная с числа n, по формуле для n + 1 члена последовательности:
    // n + 1 = 2n Длина последовательности l.
    public static void sequence18(int n, int l) {
        if (n < l) {
            System.out.println("[" + n + "]" + " = " + n);
            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }
        } else {
            System.out.println("Error");
        }
    }

    //Task 19
    // Сгенерируйте последовательность целых положительных двузначных чисел, в которых разница между первой цифрой
    // (десятки) и второй цифрой (единицы) не превышает 3.
    public static void sequence19() {
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    //Task 20
    //Написать метод, который вычислит значение функции:
    public static void task20(double x) {
        if (x < 1.5) {
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if (x <= 1.5 && x >= 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }
}

