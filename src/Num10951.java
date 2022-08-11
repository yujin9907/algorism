import java.util.Scanner;

public class Num10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String arr = s.nextLine();
            String[] arr2 = arr.split(" ");
            System.out.println(arr2[1]);
            int a = Integer.parseInt(arr2[0]);
            int b = Integer.parseInt(arr2[1]);
            System.out.println(a+b);
        }
    }
}

// 요점은 무한으로 반복하게 하는 것이 아님.