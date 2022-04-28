package hw_7_2;

public class Manager extends Employee {


   /* Задача №3

    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/

   public Manager(String name, int age, char gender, double salaryPerDay) {
       super(name, age, gender, salaryPerDay);
   }
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double sum = super.getSalary(monthArray);
        return sum + (sum * getNumberOfSubordinates() * 0.01);

    }
}
