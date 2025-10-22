package org.example;

import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for(int x=1;x<=n;x++){
            int max = (int)Math.sqrt(x);
            int prime = 0;
            for(int i = 1;i<=max;i++){
                if(x%i == 0){
                    if(check(i)){
                        prime++;
                    }
                    if(i*i!=x){
                        if(check(x/i)){
                            prime++;
                        }
                    }
                }
            }
            if(prime == 2){
                ans++;
            }
        }
        System.out.println();
        System.out.println(ans);
    }

    private static boolean check(int n){
        int max = (int)Math.sqrt(n);
        int count = 0;
        for(int i = 1;i<=max;i++){
            if(n%i==0){
                count++;
                if(i*i!=n){
                    count++;
                }
            }
        }
        return count == 2;
    }
}
