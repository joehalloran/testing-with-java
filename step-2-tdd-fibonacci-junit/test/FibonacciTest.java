import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    private int[] results = {1,1,2,3,5,8,13};

    @Before
    public void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void fib_0(){
        assertEquals(1, fibonacci.fib(0));
    }

    @Test
    public void fib_6(){
        assertEquals(13, fibonacci.fib(6));
    }

    @Test
    public void fib_test(){
        for(int i = 0; i < results.length; i++) {
            assertEquals(results[i], fibonacci.fib(i));
        }
    }

}
