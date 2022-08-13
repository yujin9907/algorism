import java.util.Scanner;

public class Num1924 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        int date = 0;
        String n = "";

        switch (date) {
            case 1:
                date+=y;
                break;
            case 2:
                date+=31+y;
                break;
            case 3:
                date+=31+28+y;
                break;
            case 4:
                date+=31+28+30+y;
                break;
        }
        if(date%7==0){
            n="SUN";
        } else if(date%7==1){
            n="MON";
        } else if (date % 7 == 2) {
            n="TUE";
        } else if (date % 7 ==3) {
            n="WED";
        } else if (date%7==4) {
            n = "THU";
        } else if (date%7==5) {
            n = "FRI";
        } else {
            n = "SAT";
        }
    }
}
