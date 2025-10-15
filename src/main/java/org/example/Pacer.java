package org.example;

import java.util.Scanner;

public class Pacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int ans = 0;
            int currAns = 0;
            int currSide = 0;
            int currTime = 0;
            for(int j = 0;j<n;j++){
                int time = scanner.nextInt();
                int side = scanner.nextInt();
                currAns = time-currTime;

                if(currAns%2==0){
                    currSide = 0 + currSide;
                    if(currSide % 2==0){
                        currSide = 0;
                    }else{
                        currSide = 1;
                    }
                }else{
                    currSide = 1 + currSide;
                    if(currSide % 2==0){
                        currSide = 0;
                    }else{
                        currSide = 1;
                    }
                }
                if(currSide!=side){
                    currSide = side;
                    currAns--;
                }
                currTime = time;
                ans+=currAns;
//                System.out.println(ans + " " + currSide + " " + currTime);
            }
            if(currTime < m){
                ans += (m-currTime);
            }
            System.out.println(ans);
        }

    }
}
