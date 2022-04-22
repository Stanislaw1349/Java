package hw_7_2;

public class Month {
    //Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.

    private final String month;
    private final int day;
    private final int worksDay;

    public Month(String month, int day, int worksDay) {
        this.month = month;
        this.day = day;
        this.worksDay = worksDay;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getWorksDay() {
        return worksDay;
    }
}
