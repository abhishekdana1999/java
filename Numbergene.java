import java.util.Scanner;

public class Numbergene {
    public static void main(String[] args) {

        int num1, num2;
        String[] numberg = { "1", "3" };
        num1 = Integer.parseInt(numberg[0]);
        num2 = Integer.parseInt(numberg[1]);
        if (num1 > num2) {
            System.out.print("Error");
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
    }
}