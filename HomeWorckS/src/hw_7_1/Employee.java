package hw_7_1;

public class Employee {

    /*Задача №1

    Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату*/

    private String name;
    private int BaseSalary;
    private  int Salary;

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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

}

