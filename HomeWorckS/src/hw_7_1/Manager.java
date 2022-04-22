package hw_7_1;

public class Manager extends Worker{

    int numberOfSubordinates;

    public Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
      if (numberOfSubordinates == 0){
          return super.getSalary();
      } else {
          return getBaseSalary() * (numberOfSubordinates / 100 * 3);
      }

    }
}



