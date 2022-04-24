package hw_9_2;

public final class Director extends BaseManager {

    public static final int MULTIPLIER_DIRECTOR = 9;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getMultiplier() {
        return MULTIPLIER_DIRECTOR;
    }
}
