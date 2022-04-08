package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    static int fibonacciNumber(int n)
    {
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacciNumber(n - 1)
                + fibonacciNumber(n - 2);
    }

    // Driver Code
    public static void
    main(String args[])
    {
        // Given Number N
        int N = 40;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fibonacciNumber(i) + " ");
        }
    }

}
