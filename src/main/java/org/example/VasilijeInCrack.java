package org.example;

import java.util.Scanner;

public class VasilijeInCrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long start = k*(k+1)/2;
            long end = n*(n+1)/2 - (n-k)*(n-k+1)/2;

            if(x > end || x < start){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
