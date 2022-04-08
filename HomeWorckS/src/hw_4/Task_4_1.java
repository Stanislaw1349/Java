package hw_4;

public class Task_4_1 {
    public static void main(String[] args) {


        System.out.println("Задача №1");
        /*Задача №1

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

        System.out.println("Задача №2");

       /* Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++){
            if (max < array2[i]){
                max = array2[i];
            }
        }
        System.out.println(max);

        System.out.println("Задача №3");
    /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.
*/
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++){
            if (min > array3[i]){
                min = array3[i];
            }
        }
        System.out.println(min);

        System.out.println("Задача №4");
        /*
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum4 = 0;
        for (int i = 0; i < array.length; i++){
            sum4 = sum4 + array[i];
        }
        System.out.println(sum4 / array4.length);

        System.out.println(" Задача №5");
       /*
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum5 = 0;
        for (int i = 0; i < array5.length; i++){
            for (int j = 0; j < array5[i].length; j++){
                sum5 = sum5 + array5[i][j];
            }
        }
        System.out.println(sum5);


        System.out.println("Задача №6");
     /* Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/
        int[][] array6 = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};

        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6[i].length; j++){
                if (max6 < array6[i][j]){
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);


        System.out.println("Задача №7");
     /* Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.*/

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array5.length; i++){
            count = count + array7[i].length;
        }
        System.out.println(count);
    }
}
