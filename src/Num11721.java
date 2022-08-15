import java.util.Scanner;

public class Num11721 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if(i!=0 && (i+1)%10==0) {
                System.out.println("");
            }

        }
    }
}
