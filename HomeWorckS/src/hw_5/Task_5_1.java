package hw_5;

public class Task_5_1 {



    public static void main(String[] args) {
        System.out.println("Задача №1");

        /*"Необходимо написать 4 метода:\n" +
          "сложение 2х чисел\n" +
          "вычитание 2х чисел\n" +
          "умножение 2х чисел\n" +
           "деление 2х чисел\n"*/
        HW5_1 hw = new HW5_1();
        System.out.println(hw.sum(5, 3));
        System.out.println(hw.subtraction(5,3));
        System.out.println(hw.multiplication(5,3));
        System.out.println(hw.division(5,3));
    }
}
