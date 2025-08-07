package com.tandemloop;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int count = 0, num = 1;
        while (count < a) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}
