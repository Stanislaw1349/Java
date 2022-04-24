package hw_9_2;

public class Worker extends Employee {

    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
