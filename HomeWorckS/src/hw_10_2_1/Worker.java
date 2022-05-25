package hw_10_2_1;

public class Worker implements IEmployee {

    private String name;
    private double baseSalary;
    private int salary;

    public Worker(String name, double baseSalary, int salary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }

}
