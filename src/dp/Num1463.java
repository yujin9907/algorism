package dp;

import java.util.Scanner;

public class Num1463 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;

        while(n>1){
            if(n%3==0){
                n/=3;
                num++;
                // if(n%2==0)
            } else if(n%3==1){
                n-=1;
                num++;
            } else {
                n-=1;
                num++;
            }
        }
        System.out.println(num);
    }
}
