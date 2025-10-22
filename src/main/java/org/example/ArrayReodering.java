//package org.example;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ArrayReodering {

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int countEven = 0;
            List<Integer> odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] % 2 == 0) {
                    countEven++;
                }else {
                    odd.add(arr[i]);
                }
            }
            int ans = 0;
            for (int i = 0; i < countEven; i++) {
                ans += (n - (i + 1));
//                System.out.println(ans);
            }

            for(int i = 0; i < odd.size(); i++){
                for(int j = i+1; j < odd.size(); j++){
                    int gcd1 = gcd(odd.get(i),odd.get(j));
                    if(gcd1>1){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    // Fast i-o
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            this.br = new BufferedReader(new InputStreamReader(System.in));
        }

        //
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int  nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[]  nextIntArr(int n){
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {

                arr[i] = nextInt();
            }
            return arr;
        }

    }
}
