package hw_9_2_1;

public abstract class BaseManager extends Worker{

    private static final int MULTIPLIER = 3;

     private int numberOfSubordinates;

    public BaseManager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getMultiplier();

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0){
            return super.getSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getMultiplier());
        }
    }
}
