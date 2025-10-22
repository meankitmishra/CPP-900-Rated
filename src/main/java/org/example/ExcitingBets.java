//package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExcitingBets {
    public static void main(String[] args) {
       FastReader in = new FastReader();
       int t = in.nextInt();
       while (t-- > 0) {
           long a = in.nextLong();
           long b = in.nextLong();
           if(a<b){
               a = a+b;
               b = a-b;
               a = a-b;
           }
           // a>=b

           long diff = a-b;
           if(diff == 0){
               System.out.println(0+" "+0);
               continue;
           }


           long dec = a%diff;
           long inc = diff -(a%diff);
           if(dec > inc){
               System.out.println(diff + " "+inc);
           }else{
               System.out.println(diff + " "+dec);
           }

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
