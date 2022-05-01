package hw_9_2_2;

public final class Employee extends BaseEmployee {

    //Необходимо реализовать задание из Task 7_2 со следующими условиями:
    //Класс Month сделать неизменяемым (immutable)
    //Статические поля с объектами месяцев должны быть финальными
    //Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
    //Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
    //Классы Employee и Manager должны быть финальными


    public Employee(String name, int age, char gender, double salaryPerDay) {
        super(name, age, gender, salaryPerDay);
    }
}
