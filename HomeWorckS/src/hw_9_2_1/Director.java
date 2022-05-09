package hw_9_2_1;

public final class Director extends BaseManager {

    public static final int MULTIPLIER = 9;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * MULTIPLIER);
        }
    }
}
