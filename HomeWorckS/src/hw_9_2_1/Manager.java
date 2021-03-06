package hw_9_2_1;

public final class Manager extends BaseManager {

    public static final int MULTIPLIER = 3;

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
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



