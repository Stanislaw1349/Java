package hw_10_2_2;

public final class Manager extends BaseEmployee {

   public Manager(String name, int age, char gender, double salaryPerDay) {
       super(name, age, gender, salaryPerDay);
   }
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(MonthUtils.IMonth[] monthArray) {
        double sum = super.getSalary((MonthUtils.IMonth[]) monthArray);
        return sum + (sum * getNumberOfSubordinates() * 10 / 100);
    }
}
