package math_problems;
import javax.security.sasl.SaslClient;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Fibonacci {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static int fibonacciNumber(int n) {
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacciNumber(n - 1)
                + fibonacciNumber(n - 2);
    }


    public static void main(String args[]) {
        int N = 40;


        for (int i = 0; i < N; i++) {

            System.out.println(fibonacciNumber(i) + " ");
        }
    }


}


