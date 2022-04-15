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
            if  (i == 0){
                System.out.print("\u001B[36m" + "ZERO");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i);
            } else if  (i % 12 == 0){
                System.out.print("\u001B[31m" + i);
            }
           System.out.print( i + " ");
        }
        System.out.println("\u001B[0m");
        System.out.println();
        line();

       task(10);
        task10(-1.0, 5.0, 0.5);

        System.out.println();
        line();
        task(13);
       // Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        for (int i = 0; i <= 9999; i++){
            System.out.print(i);
        }
        System.out.println();
        line();

        task(14 );
        //Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

        task(15);
        //Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25


    }

    // Task 10
    //Написать метод, который принимает на вход параметры start, end, step,
    // и печатает последовательность десятичных чисел, начиная с числа start, с шагом step.
    // Точка выхода из цикла - число end.
    public static void task10(double start, double end, double step){

            if (step == 0){
                System.out.println("Error");
            } else if (start < end){
                    for (double i  = start; i < end; i += step){
                        System.out.print(i + ", ");
                    }

            } else if (start > end){
                for (double i  = start; i > end; i += step){
                    System.out.print(i + ", ");
                }
            }





        System.out.println();
        line();



    }
    //Task 11
    //Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
    // Длина последовательности = l.
    public static int sequenceEven(int l){
        int counter =0;
        for (int i = l; ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            } else if (counter == l){
            }
            return i;
        }
    }
    //Task 12
    //Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void degreeN (int n){
        for (int i = 1; i <= n; i = 2 * i){
           System.out.print(i + ",");
        }
    }

    // Task 16
    //Написать метод, который принимает параметры n, m, l,
    // и печатает последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l.
    public static void sequenceOdd (int n, int m, int l){
        int count = 0;
        for (int i = n; ; i += m){
            if (i % 2 != 0){
                count ++;
                System.out.println(i);
        } else if  (count == l){
                break;
            }

        }

    }
}

