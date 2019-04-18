import java.util.*;

class triangle {
 public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.println("\t\t\t Space \n");
    for(int i=0;i<5;i++) {
        for(int j=0;j<=i;j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
 }   
}