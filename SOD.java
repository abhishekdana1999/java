import java.util.*;

class SOD {
 public static void main(String args[]) {
     int n, m ,sum=0;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter The Number \n");
    m = scn.nextInt();

    while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
 }   
}