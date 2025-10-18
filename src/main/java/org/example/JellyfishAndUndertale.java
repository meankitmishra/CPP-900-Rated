package org.example;

import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            if(b!=1){
                sum = b-1;
            }
            b = 1;
            for(int i=0;i<n;i++){
                if(arr[i] + b  > a){
                    b = a;
                }else{
                    b = arr[i]+b;
                }
                sum += b-1;
                b = 1;

            }
            sum++;
            System.out.println(sum);
        }
    }
}
