package com.projects.study.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = scanner.nextInt();
        System.out.println("enter numbers");
        String numbers = scanner.next();
        String[] parts = numbers.split(" ");
        int[] array = null;
        if (n > 0) {
            array = new int[n];
        }

        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
