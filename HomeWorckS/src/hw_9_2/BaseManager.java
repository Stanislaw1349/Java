package hw_9_2;

public abstract class BaseManager extends Worker{

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
    public int getSalary() {
        if (numberOfSubordinates == 0){
            return super.getSalary();
        } else {
            return getBaseSalary() * (numberOfSubordinates / 100 * getMultiplier());
        }
    }
}
