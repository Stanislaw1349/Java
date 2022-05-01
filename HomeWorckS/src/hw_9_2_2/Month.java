package hw_9_2_2;

 final class Month {

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
