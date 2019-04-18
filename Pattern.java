
public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + "\t");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* " + "\t");
            }
            System.out.println();
        }
    }
}