package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Num4673 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<a.length();i++){
            arr.add(Integer.parseInt(a.substring(i)));
        }
        System.out.println(arr);
    }
}
