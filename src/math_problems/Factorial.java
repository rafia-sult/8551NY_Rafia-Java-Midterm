package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    // using recursive
    public static int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println("Recursive Factorial of  " + number + " is: " + result);
        System.out.println("Iteration Factorial of " + 5 + " is: " + iteration(5));
    }

    // another way using iteration


    public static int iteration(int num) {
        int x = 0;
        if (num <= 1) {
            return num;
        }

        for (int y = num - 1; y > 0; y--) {
            if (x > 0) {
                x = x * y;
            } else if (x == 0) {
                x += num * y;
            }
        }
        return x;
    }
}
