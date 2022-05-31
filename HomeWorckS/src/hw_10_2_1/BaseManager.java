package hw_10_2_1;

public abstract class BaseManager extends Worker implements IManager {
public static final int MULTIPLIER = 3;
private int numberOfSubordinates;

    public BaseManager(String name, double baseSalary, int salary, int numberOfSubordinates) {
        super(name, baseSalary, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getMultiplier();

    @Override
    public double getSalary(){
        if (numberOfSubordinates == 0){
return super.getSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getMultiplier());
        }
    }
}
