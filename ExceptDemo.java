import java.util.*;

class Except extends Exception {

    Except(String str)
    {
        super(str);
    }

}


public class ExceptDemo {
    public static void main(String[] args) throws Except {
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A Age");
        a = scn.nextInt();

        if(a < 18)
        {
            throw(new Except("Age Not Valid"));
        }
    }
}

