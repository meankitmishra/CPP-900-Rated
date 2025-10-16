package org.example;

import java.util.Scanner;

public class LeftAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        while (test-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k  = sc.nextLong();
            long max = Long.max(x, y);
            if(k>=max){
                System.out.println(1);
            }else{
                long g = gcd(x,y);
                long dx = x/g;
                long dy = y/g;
                if(dx<=k && dy<=k ){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }
        }
    }
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
