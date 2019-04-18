import java.util.*;

interface HDFC {
    void deposite(int value);
    
}


class Hdfc implements HDFC {

      
    public void deposit(int value) {
        System.out.println("Transaction Using HDFC");
        System.out.println("Deposit Of Amount "+value+" Success");
       
    }

   

}



class Main extends Hdfc {
   public static void main(String[] args) {
   int dvalue ;
   Main obj = new Main();  

   System.out.print("Enter The Amount To Be Deposit");  
   Scanner scn = new Scanner(System.in);
   dvalue = scn.nextInt();
   obj.deposit(dvalue);
   
 
}

}