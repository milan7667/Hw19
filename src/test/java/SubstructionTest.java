import org.junit.*;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;


class SubstructionTest {

    @Before
    public void someBefore() {
        System.out.println("The test starts");
        Substraction calculator = new Substraction();

    }

    @Test (expected= TimeoutException.class, timeout=2000)
    public  void test1Subtract() {
        Substraction calculator = new Substraction();

        int expectedResult = 2;

        assertEquals(expectedResult, calculator.substract(5, 3));
        assertTrue(expectedResult == 5 - 3);
        assertSame(expectedResult, calculator.substract(5, 3));
        assertNotNull (calculator);

    }

    @Test (expected= TimeoutException.class, timeout=2000)
    public  void test2Subtract() {
        Substraction calculator = new Substraction();

        int expectedResult = 100;

        assertEquals(expectedResult, calculator.substract(100, 0));
        assertTrue(expectedResult == 100 - 0);
        assertSame(expectedResult, calculator.substract(100, 0));
        assertNotNull (calculator);

    }

    @Test (expected= TimeoutException.class, timeout=2000)
    public  void test3Subtract() {
        Substraction calculator = new Substraction();

        int expectedResult = 8;

        assertEquals(expectedResult, calculator.substract(10, 2));
        assertTrue(expectedResult == 10 - 2);
        assertSame(expectedResult, calculator.substract(10, 2));
        assertNotNull (calculator);

    }

    @Test (expected= TimeoutException.class, timeout=2000)
    public  void test4Subtract() {
        Substraction calculator = new Substraction();

        int expectedResult = -9;

        assertEquals(expectedResult, calculator.substract(-8, -1));
        assertTrue(expectedResult == -8 - 1);
        assertSame(expectedResult, calculator.substract(-8, -1));
        assertNotNull (calculator);

    }

    @Test (expected= TimeoutException.class, timeout=2000)
    public  void test5Subtract() {
        Substraction calculator = new Substraction();

        int expectedResult = 0;

        assertEquals(expectedResult, calculator.substract(5, -5));
        assertTrue(expectedResult == 5 - 5);
        assertSame(expectedResult, calculator.substract(5, -5));
        assertNotNull (calculator);

    }
    @After
    public void afterTest() {
        System.out.println("The test is over");
    }

}