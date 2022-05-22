import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve() {
        int[] testDataArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int testDataStart = 2;
        int testDataEnd = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAve(testDataArr, testDataStart, testDataEnd);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testArrayLength0() {
        int[] testDataArr = {3};
        int testDataStart = 0;
        int testDataEnd = 0;
        int[] expectedResult = {3, 3, 3};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAve(testDataArr, testDataStart, testDataEnd);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testZero() {
        int[] testDataArr = {0, 0, 0, 0};
        int testDataStart = 1;
        int testDataEnd = 2;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAve(testDataArr, testDataStart, testDataEnd);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNegIndex() {
        int[] testDataArr = {1, 3, 4, 7};
        int testDataStart = -5;
        int testDataEnd = -1;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAve(testDataArr, testDataStart, testDataEnd);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
