import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void calculate_0() {
        Factorial factorial = new Factorial();
        int testStartValue = 0;
        int expectedResult = 0;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_1() {
        Factorial factorial = new Factorial();
        int testStartValue = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_2() {
        Factorial factorial = new Factorial();
        int testStartValue = 2;
        int expectedResult = 2;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_3() {
        Factorial factorial = new Factorial();
        int testStartValue = 3;
        int expectedResult = 6;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }
}
