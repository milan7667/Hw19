import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

public class DivisionTest {
    @Before
    public void someBefore() {
        System.out.println("The test starts");
        Division calculator = new Division();

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test1Divis() {
        Division calculator = new Division();

        int expectedResult = 2;

        assertEquals(expectedResult, calculator.divis(4, 2));
        assertTrue(expectedResult == 4 / 2);
        assertSame(expectedResult, calculator.divis(4, 2));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test2Divis() {
        Division calculator = new Division();

        int expectedResult = -3;

        assertEquals(expectedResult, calculator.divis(-6, 2));
        assertTrue(expectedResult == -6 / 2);
        assertSame(expectedResult, calculator.divis(-6, 2));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test3Divis() {
        Division calculator = new Division();

        int expectedResult = -5;

        assertEquals(expectedResult, calculator.divis(-10, 2));
        assertTrue(expectedResult == -10 / 2);
        assertSame(expectedResult, calculator.divis(-10, 2));
        assertNotNull(calculator);

    }

    @Test(expected = TimeoutException.class, timeout = 2000)
    public void test4Divis() {
        Division calculator = new Division();

        int expectedResult = -3;

        assertEquals(expectedResult, calculator.divis(-3, 1));
        assertTrue(expectedResult == -3 / 1);
        assertSame(expectedResult, calculator.divis(-3, 1));
        assertNotNull(calculator);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test5Divis() {
        Division calculator = new Division();

        int expectedResult = 0;

        assertEquals(expectedResult, calculator.divis(-3, 0));
        assertTrue(expectedResult == -3 / 0);
        assertSame(expectedResult, calculator.divis(-3, 0));
        assertNotNull(calculator);

    }
}


