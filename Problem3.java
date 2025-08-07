package com.tandemloop;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int limit = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
