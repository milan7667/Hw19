import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

public class PercentTest {

    @Before
    public void someBefore() {
        System.out.println("The test starts");
        Percent calculator = new Percent();

    }

    @Test(expected = TimeoutException.class, timeout = 1000)
    public void test1Subtract() {
        Percent calculator = new Percent();

        int expectedResult = 1;

        assertEquals(expectedResult, calculator.returnPercent(100));
        assertTrue(expectedResult == 100 / 100);
        assertSame(expectedResult, calculator.returnPercent(100));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test2Subtract() {
        Percent calculator = new Percent();

        int expectedResult = -1;

        assertEquals(expectedResult, calculator.returnPercent(-1));
        assertTrue(expectedResult == -100 / 100);
        assertSame(expectedResult, calculator.returnPercent(-100));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test3Subtract() {
        Percent calculator = new Percent();

        int expectedResult = 0;

        assertEquals(expectedResult, calculator.returnPercent(0));
        assertTrue(expectedResult == 0 / 100);
        assertSame(expectedResult, calculator.returnPercent(0));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test4Subtract() {
        Percent calculator = new Percent();

        int expectedResult = 10;

        assertEquals(expectedResult, calculator.returnPercent(1000));
        assertTrue(expectedResult == 1000 / 100);
        assertSame(expectedResult, calculator.returnPercent(1000));
        assertNotNull(calculator);

    }
}
