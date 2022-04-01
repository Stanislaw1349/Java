package HW_2;
public class Task_2 {
   /* Задача №1
    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и
    вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
    Так же сделать проверку на четность этих переменных и вывести результат.
*/
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        System.out.println("a is odd " + a % 2);
        System.out.println("b is odd " + a % 2);


        /*Экстра задача
        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).*/

        System.out.println("\uD83D\uDE00");
    }
}
