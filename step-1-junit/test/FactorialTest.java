
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void calculate_0() {
        int testStartValue = 0;
        int expectedResult = 0;
        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_1() {
        int testStartValue = 1;
        int expectedResult = 1;
        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_2() {
        int testStartValue = 2;
        int expectedResult = 2;
        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_3() {
        int testStartValue = 3;
        int expectedResult = 6;
        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_4() {
        Factorial factorial = new Factorial();
        int testStartValue = 4;
        int expectedResult = 24;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test(expected=IllegalArgumentException.class)
    public void calculate_negative() {
        factorial.calculate(-5);
    }
}
