package hw_9_2_2;

public class MonthUtils {

    private static final Month JANUARY = new Month("January", 31, 20);
    private static final Month FEBRUARY = new Month("February", 28, 20);
    private static final Month MARCH = new Month("March", 31, 22);
    private static final Month APRIL = new Month("April", 30, 21);
    private static final Month MAY = new Month("May", 31, 20);
    private static final Month JUNE = new Month("June", 30, 22);
    private static final Month JULY = new Month("July", 31, 21);
    private static final Month AUGUST = new Month("August", 31, 23);
    private static final Month SEPTEMBER = new Month("September", 30, 22);
    private static final Month OCTOBER = new Month("October", 31, 21);
    private static final Month NOVEMBER = new Month("November", 30, 21);
    private static final Month DECEMBER = new Month("December", 31, 22);


    private static final Month[] YEAR = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static final Month[] Q1 = {
            JANUARY, FEBRUARY, MARCH
    };

    public static final Month[] Q2 = {
            APRIL, MAY, JUNE
    };

    public static final Month[] Q3 = {
            JULY, AUGUST, SEPTEMBER
    };

    public static final Month[] Q4 = {
            OCTOBER, NOVEMBER, DECEMBER
    };

    private static final Month[] H1 = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    };

    private static final Month[] H2 = {
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static Month getMonth(int index) {

        return YEAR[index];
    }

    public static int getMonthSize() {

        return YEAR.length;
    }

    public static Month[] getYear() {

        return YEAR;
    }

    public static Month[] getQ1() {

        return Q1;
    }

    public static Month[] getQ2() {

        return Q2;
    }

    public static Month[] getQ3() {

        return Q3;
    }

    public static Month[] getQ4() {

        return Q4;
    }

    public static Month[] getH1() {

        return H1;
    }

    public static Month[] getH2() {

        return H2;
    }
}
