import java.util.*;

public class Point {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double d;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter X1");
        x1 = scn.nextFloat();
        System.out.println("Enter X2");
        x2 = scn.nextFloat();
        System.out.println("Enter Y1");
        y1 = scn.nextFloat();
        System.out.println("Enter Y2");
        y2 = scn.nextFloat();

        double ans = (Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        double res = Math.sqrt(ans);
        System.out.println(res);
    }
}