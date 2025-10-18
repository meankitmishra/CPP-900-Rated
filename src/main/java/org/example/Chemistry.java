package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t =  in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            int countOdd = 0;
            for(Integer i : map.values()){
                if(i %2 ==1){
                    countOdd++;
                }
            }
            if( ( n-k ) % 2 == 0){
                if(countOdd > k){
                    System.out.println("NO");
                    continue;
                }
            }else{

                if(countOdd > k+1){
                    System.out.println("NO");
                    continue;
                }
            }
            System.out.println("YES");
        }
    }
}
