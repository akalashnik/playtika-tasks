package com.company.Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        System.out.println("This program will process your string and define if is a palindrome or not.");
        System.out.println("Please type your string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (isPalindrome(input)) {
            System.out.println("Your string is a palindrome.");
        } else {
            System.out.println("Your string is not a palindrome.");
        }
    }


    public static Boolean isPalindrome(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}