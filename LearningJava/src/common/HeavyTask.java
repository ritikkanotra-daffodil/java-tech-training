package common;

public class HeavyTask {

    /**
     * method to find the nth fibonacci number using recursive approach
     * without using memoization (to make it a time-consuming task)
     *
     * TC: O(2^(n - 1) -    1)
     *
     * @param n nth place of which the method finds the fibonacci number
     * @return returns the nth fibonacci number (fibonacci numbers can be larger than 2^31 - 1, hence using long)
     */
    public static long findNthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return findNthFibonacci(n - 2) + findNthFibonacci(n - 1);
    }

}
