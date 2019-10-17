package com.company.RandomNumbersArray;

import java.util.Scanner;

public class RandomNumbersArray {
    public static void main(String[] args) {
        int [] array;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n * 100);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Elements are: [" + array[i] + "]");
        }
        for (int i = 0; i < n; i++) {
            if(array[i]%2==0) System.out.println("Even element: [" + array[i] + "]");
        }
        for (int i = 0; i < n; i++) {
            if(array[i]%2!=0) System.out.println("Odd element: [" + array[i] + "]");
        }
        for (int i = 0; i < n; i++) {
            if(array[i]%3==0) System.out.println("Could be divided by 3: [" + array[i] + "]");
        }
        for (int i = 0; i < n; i++) {
            if(array[i]%5==0) System.out.println("Could be divided by 5: [" + array[i] + "]");
        }
    }
}