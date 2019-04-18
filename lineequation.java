import java.util.Scanner;

public class lineequation {
    public static void main(String[] args) {
        float y, m, c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value Of Y");
        y = scn.nextFloat();
        System.out.println("Enter Value Of m");
        m = scn.nextFloat();
        System.out.println("Enter Value Of c");
        c = scn.nextFloat();
        float x = (y - c) / m;
        System.out.print(x);
    }
}