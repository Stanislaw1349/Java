package hw_9_2;

public abstract class Employee {

/*
    Необходимо реализовать задание из Task 7_1 со следующими условиями:
    Employee.getSalary должен быть абстрактный
    Worker.getBaseSalary должен быть финальным
    Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
    Классы Manager и Director должны быть финальными
*/

    /*Задача №1
    Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату*/

    private String name;
    private int BaseSalary;
    private int Salary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        BaseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public abstract int getSalary();

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

}

