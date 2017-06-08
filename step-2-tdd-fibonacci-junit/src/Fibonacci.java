public class Fibonacci {

    // Finds the nth item in the fibonacci sequence
    public int fib(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorials are defined only on non-negative integers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
