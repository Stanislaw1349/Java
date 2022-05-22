package hw_10_2_2;

public class MonthUtils {

    public interface IMonth {
        String getMonth();
        int getDay();
        int getWorksDay();
    }

    private static class MonthImpl implements IMonth {
        private final String month;
        private final int day;
        private final int worksDay;

        public MonthImpl(String month, int day, int worksDay) {
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

    private static final IMonth JANUARY = new MonthImpl("January", 31, 20);
    private static final IMonth FEBRUARY = new MonthImpl("February", 28, 20);
    private static final IMonth MARCH = new MonthImpl("March", 31, 22);
    private static final IMonth APRIL = new MonthImpl("April", 30, 21);
    private static final IMonth MAY = new MonthImpl("May", 31, 20);
    private static final IMonth JUNE = new MonthImpl("June", 30, 22);
    private static final IMonth JULY = new MonthImpl("July", 31, 21);
    private static final IMonth AUGUST = new MonthImpl("August", 31, 23);
    private static final IMonth SEPTEMBER = new MonthImpl("September", 30, 22);
    private static final IMonth OCTOBER = new MonthImpl("October", 31, 21);
    private static final IMonth NOVEMBER = new MonthImpl("November", 30, 21);
    private static final IMonth DECEMBER = new MonthImpl("December", 31, 22);


    private static final IMonth[] YEAR = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static final IMonth[] Q1 = {
            JANUARY, FEBRUARY, MARCH
    };

    public static final IMonth[] Q2 = {
            APRIL, MAY, JUNE
    };

    public static final IMonth[] Q3 = {
            JULY, AUGUST, SEPTEMBER
    };

    public static final IMonth[] Q4 = {
            OCTOBER, NOVEMBER, DECEMBER
    };

    private static final IMonth[] H1 = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    };

    private static final IMonth[] H2 = {
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static IMonth getMonth(int index) {

        return YEAR[index];
    }

    public static int getMonthSize() {

        return YEAR.length;
    }

    public static IMonth[] getYear() {

        return YEAR;
    }

    public static IMonth[] getQ1() {

        return Q1;
    }

    public static IMonth[] getQ2() {

        return Q2;
    }

    public static IMonth[] getQ3() {

        return Q3;
    }

    public static IMonth[] getQ4() {

        return Q4;
    }

    public static IMonth[] getH1() {

        return H1;
    }

    public static IMonth[] getH2() {

        return H2;
    }
}
