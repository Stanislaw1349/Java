package hw_9_2_1;

public final class Director extends BaseManager {

    public static final int MULTIPLIER = 9;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getMultiplier() {
        return MULTIPLIER;
    }
}
