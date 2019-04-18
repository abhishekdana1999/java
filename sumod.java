import java.util.*;

public class sumod {
    public static void main(String[] args) {
        int row;
        Scanner scn = new Scanner(System.in);
        row = scn.nextInt();
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row; j++) {
                System.out.print(i);
            }
            row--;
            System.out.println();
        }
    }

}