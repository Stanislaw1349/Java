package hw_10_2_1;

public final class Manager extends BaseManager {

    public static final int MULTIPLIER = 3;

    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int salary, int numberOfSubordinates, int numberOfSubordinates1) {
        super(name, baseSalary, salary, numberOfSubordinates);
        this.numberOfSubordinates = numberOfSubordinates1;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getMultiplier() {
        return MULTIPLIER;
    }
}



