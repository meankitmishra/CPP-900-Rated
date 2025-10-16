package org.example;

import java.util.Scanner;

public class AnotherDivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            long x = 2*n;

            System.out.println(x);

        }
    }
}
