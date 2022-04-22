package hw_7_1;

public class Director extends Manager{

    public Director(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0){
            return super.getSalary();
        } else {
            return getBaseSalary() * (numberOfSubordinates / 100 * 9);
        }

    }
}
