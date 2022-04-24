package hw_9_2_1;

public class EmployeeHelper {

      public static Employee findByName(String name, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

    public static Employee findBySubName(String subName, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;
    }

    public static int getSalarySum(Employee[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getSalary();
        }
        return result;
    }

    public static Employee getSalaryMin(Employee[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Employee salaryMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (salaryMin.getSalary() < array[i].getSalary()) {
                salaryMin = array[i];
            }
        }
        return salaryMin;
    }

    public static Employee getSalaryMax(Employee[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Employee salaryMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (salaryMax.getSalary() > array[i].getSalary()) {
                salaryMax = array[i];
            }
        }
        return salaryMax;
    }

    public static Manager getMinOfSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager result = array[0];
        for (int i = 0; i < array.length; i++){
            if (result.getNumberOfSubordinates() < array[i].getNumberOfSubordinates()){
                result = array[i];
            }
        }
        return result;
    }

    public static Manager getMaxOfSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager result = array[0];
        for (int i = 0; i < array.length; i++){
            if (result.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()){
                result = array[i];
            }
        }
        return result;
    }

    public static Manager getMaxOfSupplement(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager result = array[0];
        for (int i = 0; i < array.length; i++){
            if ((result.getSalary() - result.getBaseSalary()) > array[i].getSalary()){
                result = array[i];
            }
        }
        return result;
    }

    public static Manager getMinOfSupplement(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager result = array[0];
        for (int i = 0; i < array.length; i++){
            if ((result.getSalary() - result.getBaseSalary()) < array[i].getSalary()){
                result = array[i];
            }
        }
        return result;
    }
}
