package com.company.Calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a simple calculator. Type 'quit' and press [Enter] if you want to quit \nType the expression: ");
        while (scanner.hasNext()) {

            String userInput = scanner.next();
            if (userInput.contains("quit")) {
                scanner.close();
                System.exit(0);
            }

            StringTokenizer tokenizer = new StringTokenizer(userInput, "+-*/", true);//        ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<String> str = new ArrayList<>();

            while (tokenizer.hasMoreElements()) {
                String temp = tokenizer.nextToken();
                str.add(temp);
            }

            double num1 = getNum1(str);
            char action = getOperation(str);
            double num2 = getNum2(str);
            boolean isDivide;
            boolean isZero;
            isDivide = action == '/';
            isZero = num2 == 0;
            if (isZero && isDivide) {
                System.out.println("It is prohibited to divide by zero \nType the expression: ");

            } else {
                System.out.println("Result: " + result(num1, num2, action) + "\nType the expression: ");
            }
        }
    }

    public static double result (double num1, double num2, char action){
        double result = 0;

        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Expression or Action is not recognized. \nType the expression: ");
        }
        return result;
    }

    public static double getNum1 (ArrayList str) {
        double num1 = 0;
        try {
            num1 = Double.parseDouble((String) str.get(0));
        }
        catch (NumberFormatException e){
        }
        return num1;

    }

    public static char getOperation (ArrayList str) {
        char action = ' ';
        try {
            action = ((String) str.get(1)).charAt(0);
        }
        catch (IndexOutOfBoundsException e) {
        }
        return action;
    }

    public static double getNum2 (ArrayList str) {
        double num2 = 0;
        try {
            num2 = Double.parseDouble((String) str.get(2));
        }
        catch (NumberFormatException e){
        }
        catch (IndexOutOfBoundsException e){
        }
        return num2;
    }

}

