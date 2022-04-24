package hw_9_2_1;

public final class Manager extends BaseManager {

    public static final int MULTIPLIER_MANAGER = 3;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getMultiplier() {
        return MULTIPLIER_MANAGER;
    }
}



