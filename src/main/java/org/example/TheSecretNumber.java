package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        while(test-- > 0){
            long n = sc.nextLong();
            long d = 11;
            ArrayList<Long> arr = new ArrayList<>();
            while(n >= d){
                if (n % d == 0)
                    arr.add(0,n/d);
                d = (d - 1) * 10 + 1;
            }

            System.out.println(arr.size());
            if(!arr.isEmpty()){
                for(long l : arr){
                    System.out.print(l + " ");
                }
                System.out.println();
            }

        }
    }
}
