package hw_10_2_2;

public final class Employee extends BaseEmployee {

    //Необходимо реализовать задание из Tasks, но класс Month заменить на интерфейс IMonth,
    // а его реализацию сделать приватным классом MonthImpl.


    public Employee(String name, int age, char gender, double salaryPerDay) {
        super(name, age, gender, salaryPerDay);
    }

    @Override
    public double getSalary(MonthUtils.IMonth[] monthArray) {
        return 0;
    }
}
