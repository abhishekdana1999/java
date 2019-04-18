import java.util.Scanner;

public class D2R {

    public static void main(String[] args) {

        float dollars;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter dollars:");

        dollars = in.nextLong();

        float rupees = dollars * 74;

        System.out.println(rupees + " Rupees");

    }
}