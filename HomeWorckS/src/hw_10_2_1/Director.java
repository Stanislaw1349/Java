package hw_10_2_1;

public final class Director extends BaseManager {

    public static final int MULTIPLIER = 9;

    public Director(String name, double baseSalary, int salary, int numberOfSubordinates) {
        super(name, baseSalary, salary, numberOfSubordinates);
    }

    @Override
    public int getMultiplier() {
        return MULTIPLIER;
    }

    @Override
    public int getNumberOfSubordinates() {
        return 0;
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {

    }
}
