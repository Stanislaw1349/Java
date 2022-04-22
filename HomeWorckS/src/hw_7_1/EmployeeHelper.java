package hw_7_1;

public class EmployeeHelper {

    /*Задача №3

    Необходимо создать утилитарный класс со следующими методами:
    поиск сотрудника в массиве по его имени
    поиск сотрудника в массиве по вхождению указанной строки в его имени
    подсчет зарплатного бюджета для всех сотрудников в массиве
    поиск наименьшей зарплаты в массиве
    поиск наибольшей зарплаты в массиве
    поиск наименьшего количества подчиненных в массиве менеджеров
    поиск наибольшего количества подчиненных в массиве менеджеров
    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров*/

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
