package homework;

public class HW2 {
    public static void main(String[] args) {
      /*  Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение
        Вывести значения переменных в столбик
        Вывести значения переменных в строку*/

        int k = 5;
        int l = 10;
        int m = 15;
        System.out.println(k + "\n" + l + "\n" + m);
        String o = "___________________________";
        System.out.println(o);

        System.out.println(k + " " + l + " " + m);
        System.out.println(o);

        String comma = ",";
        System.out.println(k + comma + l + comma + m);
        System.out.println(o);

        System.out.println("int k = " + k + "; " + "int l = " + l + "; " + "int m = " + m + ";");
        System.out.println(o);

        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + k * m);
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println(o);

        System.out.println("Результат деления k на l =  " + k / l + comma + "а остаток от деления = " + k % l);
        System.out.println("Результат деления k на m = " + k / m + comma + "а остаток от деления = " + k % m);
        System.out.println("Результат деления l на m = " + l / m + comma + "а остаток от деления = " + l % m);
        System.out.println("Результат деления m на k = " + m / k + comma + "а остаток от деления = " + m % k);
        System.out.println(o);

        int apple = 40;
        int student = 6;
        int x = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(a), и " + x + " яблок(а) останется учителю.");
        System.out.println(o);

        int apple1 = 100;
        int student1 = 21;
        int x1 = apple1 % student1;
        System.out.println("Если " + apple1 + " яблок поделить на " + student1 + " учеников, то каждый ученик получит по "
                + (apple1 / student1) + " яблок(a), и " + x1 + " яблок(а) останется учителю.");
        System.out.println(o);

        System.out.println();

 /* Распечатать вычисления и итоговый результат:
        Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = … */
        int sum = k + l + (m + 1);
        int sumKLM1 = k + l + (m - 1);
        int mpl = m + 1;
        int sumKLM = k + l + m;
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (sum + sumKLM1) + ", " + "а разность m++ и sumLKM = "
                + (mpl - sumKLM));
        System.out.println(o);

        //     Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.

        int q = 48 % 8;
        int w = 48 % 2;
        int e = 8 % 2;
        int r = 47 % 2;
        int t = 49 % 2;
        System.out.println(q + comma + w + comma + e + comma + r + comma + t);
        System.out.println(o);


       /* x = 2,   y = 3,  a = k, b = l, c = m, d = y - x

        a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
                result21, result22 и result23 - результаты вычислений в каждом выражении
        (считать с помощью программы, а не вручную!)*/
        x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        System.out.println(result21);
        int result22 = (((3 + 4 * x) / 5)) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4/x + (9 + x) / y));
        System.out.println(result22);
        int result23 = (((5 * x + 7 * y)) / ((8 * x) + (10 * y )) / ((3 * x - y) / (x + y))
                / (a + b + (c / d) + ((a+b) / (c + d)) + a * b));
        System.out.println(result23);

        System.out.println(o);
        System.out.println("| task\t|  result\t    |");
        System.out.println(o);
        System.out.println("| 21\t| " + result21 +  "\t\t    |");
        System.out.println(o);
        System.out.println("| 22\t| " + result22 +  "\t\t    |");
        System.out.println(o);
        System.out.println("| 23\t| " + result23 +  "\t\t    |");
        System.out.println(o);

    }
}



