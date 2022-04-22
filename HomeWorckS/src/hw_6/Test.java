package hw_6;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.person.name = "Felix_IX";
        employee1.salary = 1000;

        Employee employee2 = new Employee();
        employee2.person.name = "Felix_IX";
        employee2.salary = 2000;

        Salary salary = new Salary();
        Employee[] array = {employee1, employee2};

        System.out.println(employee1.isSameName(employee2));
        System.out.println(salary.getSum(array));
    }
}
