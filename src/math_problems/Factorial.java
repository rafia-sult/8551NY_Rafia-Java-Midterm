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
    static int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 5, result;
        result = factorial(number);
        System.out.println("Factorial of  " + number + " is: " + result);
    }

    // another way using iteration

//        int i, factorial = 1;
//        int num1 = 4;
//        for (i = 1; i <= num1; i++) {
//            factorial = factorial * i;
//        }
//        System.out.println("Factorial of " + num1 + " is: " + factorial);
//
//
//    }
}
