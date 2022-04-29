package hw_5;

public class Task_5_2 {
   /* Вывести следующие строки с соответствующим форматированием (как пирамиды):


    Задача №1

            0  1  2  3  4  5  6  7  8  9
            0  1  2  3  4  5  6  7  8
            0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
            0  1  2  3  4  5
            0  1  2  3  4
            0  1  2  3
            0  1  2
            0  1
            0
*/

    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }

            System.out.println();
        }



    /*    for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }

            System.out.println();
        }


        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            System.out.println();
        }*/


        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }



        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=0; j--){
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }


    }

}
