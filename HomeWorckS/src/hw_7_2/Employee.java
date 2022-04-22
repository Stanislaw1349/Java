package hw_7_2;

public class Employee {
  /*  Задача №2

    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
*/

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;


    public Employee(String name, int age, char gender, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(Month[] monthArray){
        if (monthArray == null || monthArray.length == 0) {
            return Double.parseDouble((null));
        }
        double sum = 0.0;
        for (int i = 0; i < monthArray.length; i++){
            sum +=getSalaryPerDay() * monthArray[i].getWorksDay();

        }  return sum;
    }
}
