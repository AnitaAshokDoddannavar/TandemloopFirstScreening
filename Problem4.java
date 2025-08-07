package com.tandemloop;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        // Read n numbers from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // Initialize map for 1 to 9
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }

        // Count multiples
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    map.put(i, map.get(i) + 1);
                }
            }
        }

        System.out.println("Multiples count: " + map);
    }
}
