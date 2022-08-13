package io;

import java.util.Scanner;

public class Num8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int re = 0;

        for(int i=1;i<=n;i++){
            re+=i;
        }
        System.out.println(re);
    }
}
