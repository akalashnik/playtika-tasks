package com.company.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("This program will help you to solve the Quadratic Equation");
        while (true) {
            System.out.println("Input a, b, c:");
            double a = getDouble();
            double b = getDouble();
            double c = getDouble();
            getRoots(a, b, c);
            System.out.println("Type 'c' and press [Enter] to continue. Press other button to quit");
            String str = scanner.next();
            if (!str.equals("c")) {
                scanner.close();
                System.exit(0);
            }
        }
    }

    public static double getDouble () {
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Digits only allowed. Try again");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static void getRoots (double a, double b, double c) {
        double D;

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("The roots of the quadratic equation are: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Quadratic equation has the only one root: x = " + x);
        } else {
            System.out.println("Quadratic equation has no real roots!");
        }
    }
}