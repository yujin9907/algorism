package io;

import java.util.Scanner;

public class Num10818 {
    public static void main(String[] args) {
        // 정수의 갯수 n이 주어짐으로 그냥 배열 쓰라고
        // 1. 배열의 최솟값 최댓값 함수가 있는지?
        // 2. 알고리즘으로 구현
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]= s.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min+" "+max);

    }
}
