package com.company.FibonnaciSequence;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main (String[] args) {
        while (true) {
            System.out.println("Please enter an amount of numbers of Fibonacci Sequence you want to get: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("Please start with at least 2 elements");
            } else if (n == 1) {
                System.out.println("Please start with at least 2 elements");
            }
            else {
                fib(n);
            }
            System.out.println("Type 'c' and press [Enter] to get another one sequence. Press other button to quit");
            String str = scanner.next();
            if (!str.equals("c")) {
                scanner.close();
                System.exit(0);
            }
        }
    }

    private static void fib (int n) {
        BigInteger[] fbnc = new BigInteger[n];
        fbnc[0] = BigInteger.ZERO;
        fbnc[1] = BigInteger.ONE;

        for (int i = 2; i < n; ++i) {
            fbnc[i] = fbnc[i - 1].add(fbnc[i - 2]);
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(fbnc[i]);
        }
    }
}
