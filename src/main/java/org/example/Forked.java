package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Forked {

    static class Pair{
        int x;
        int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int  hashCode(){
            return x + y;
        }

        @Override
        public boolean equals(Object p){
            if(this == p) return true;
            if(p == null || getClass()!=p.getClass()) return false;
            return x == ((Pair) p).x && y == ((Pair) p).y;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int posX = in.nextInt();
            int posY = in.nextInt();

            int kingX = in.nextInt();
            int kingY = in.nextInt();

            int QueenX = in.nextInt();
            int QueenY = in.nextInt();

            HashMap<Pair, Integer> map = new HashMap<>();
            // added king positions of knight
            Pair p1 = new Pair(kingX - posX , kingY - posY);
            map.put(p1, 0);
            Pair p2 = new Pair(kingX + posX, kingY + posY);
            map.put(p2, 0);
            Pair p3 = new Pair(kingX - posX, kingY + posY);
            map.put(p3, 0);
            Pair p4 = new Pair(kingX + posX, kingY - posY);
            map.put(p4, 0);
            Pair p5 = new Pair(kingX - posY, kingY - posX);
            map.put(p5, 0);
            Pair p6 = new Pair(kingX + posY, kingY + posX);
            map.put(p6, 0);
            Pair p7 = new Pair(kingX - posY, kingY + posX);
            map.put(p7, 0);
            Pair p8 = new Pair(kingX + posY, kingY - posX);
            map.put(p8, 0);

            int ans = 0;
            // need to add queen positions
            Pair qp1 = new Pair(QueenX - posX , QueenY - posY);
            if(map.containsKey(qp1)){
                ans++;
                map.remove(qp1);
//                System.out.println(qp1.x + " " + qp1.y);
            }
            Pair qp2 = new Pair(QueenX + posX, QueenY + posY);
            if(map.containsKey(qp2)){
                ans++;
                map.remove(qp2);
//                System.out.println(qp2.x + " " + qp2.y);
            }
            Pair qp3 = new Pair(QueenX - posX, QueenY + posY);
            if(map.containsKey(qp3)){
                ans++;
                map.remove(qp3);
//                System.out.println(qp3.x + " " + qp3.y);

            }
            Pair qp4 = new Pair(QueenX + posX, QueenY - posY);
            if(map.containsKey(qp4)){
                ans++;
                map.remove(qp4);
//                System.out.println(qp4.x + " " + qp4.y);

            }
            Pair qp5 = new Pair(QueenX - posY, QueenY - posX);
            if(map.containsKey(qp5)){
                ans++;
                map.remove(qp5);
//                System.out.println(qp5.x + " " + qp5.y);

            }
            Pair qp6 = new Pair(QueenX + posY, QueenY + posX);
            if(map.containsKey(qp6)){
                ans++;
                map.remove(qp6);
//                System.out.println(qp6.x + " " + qp6.y);

            }
            Pair qp7 = new Pair(QueenX - posY, QueenY + posX);
            if(map.containsKey(qp7)){
                ans++;
                map.remove(qp7);
//                System.out.println(qp7.x + " " + qp7.y);

            }
            Pair qp8 = new Pair(QueenX + posY, QueenY - posX);
            if(map.containsKey(qp8)){
                ans++;
                map.remove(qp8);
//                System.out.println(qp8.x + " " + qp8.y);

            }

            System.out.println(ans);

        }
    }
}
