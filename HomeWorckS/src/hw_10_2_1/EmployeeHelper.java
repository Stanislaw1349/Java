package hw_10_2_1;


/*Необходимо реализовать задание из Tasks, но класс Employee заменить на интерфейс IEmployee и добавить IManager,
        все параметры утилитарных методов сделать типа IEmployee и IManager соответственно.*/

public class EmployeeHelper {

    public static IEmployee findByName(String name, IEmployee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

    public static IEmployee findBySubName(String subName, IEmployee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;
    }

    public static double getSalarySum(IEmployee[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getSalary();
        }
        return result;
    }

    public static IEmployee getSalaryMin(IEmployee[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        IEmployee salaryMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (salaryMin.getSalary() < array[i].getSalary()) {
                salaryMin = array[i];
            }
        }
        return salaryMin;
    }

    public static IEmployee getSalaryMax(IEmployee[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        IEmployee salaryMax = array[0];
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

    public static IManager getMinOfSupplement(IManager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        IManager result = array[0];
        for (int i = 0; i < array.length; i++){
            if ((result.getSalary() - result.getBaseSalary()) < array[i].getSalary()){
                result = array[i];
            }
        }
        return result;
    }
}
