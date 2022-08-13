package io;

import java.util.Scanner;

public class Num19052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[2];
        while(true){
            a[0]=s.nextInt();
            a[1]=s.nextInt();
            if(a[0]==0 && a[1]==0){
                break;
            }
            System.out.println(a[0]+a[1]);
        }
    }
}
