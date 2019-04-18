import java.util.*;

interface Bank {
   void deposit(int value);
   int getAmount();
   void withdraw(int value);
}


class Hdfc implements Bank {

    public int tamout;
    public void deposit(int value) {
        System.out.println("Transaction Using HDFC");
        System.out.println("Deposit Of Amount "+value+" Success");
        tamout = value;
        System.out.println("Deposit Of Amount "+tamout+" Success");
    }

  

    public void withdraw(int value)
    {
        
        System.out.println("Amount Withdraw Success");
        tamout = (getAmount() - value);
        System.out.println("After Withdraw Total amount "+tamout);
    }
    public int getAmount()
    {
        return tamout;
    }

}


class Main extends Hdfc {
         public static void main(String[] args) {
        int value , totalAmount ,wAmount;
        Main obj = new Main();  

        System.out.print("Enter The Amount To Be Deposit");  
        Scanner scn = new Scanner(System.in);
        value = scn.nextInt();
        obj.deposit(value);
        totalAmount = obj.getAmount();
        System.out.println("Total amount "+totalAmount);
        System.out.print("Enter The Amount To Be Withdraw");  
       
        wAmount = scn.nextInt();
        obj.withdraw(wAmount);
        
        
    }
    
}