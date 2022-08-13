public class ClassStudy {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {

            for (int k = 3; k - i > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
    }
}
