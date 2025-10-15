package org.example;

import java.util.Scanner;

public class MexRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] count = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                count[arr[i]]++;
            }
            int mex = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < k; i++) {
                if (count[i] == 0) {
                    ans++;
                    if (count[k] > 0) {
                        count[k]--;
                    }
                }
            }
            while (count[k] > 0) {
                ans++;
                count[k]--;
            }
            System.out.println(ans);
        }

    }
}
