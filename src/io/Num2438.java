package io;

import java.util.Scanner;

public class Num2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
