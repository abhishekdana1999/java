import java.util.*;

class SimpleIn {
    String Name = "";
    float Salary = 0;
    protected void getName(String Name) {
        this.Name = Name;
        System.out.println("\n Name : \t"+this.Name);
       }
    protected void getSalary(Float Salary) {
        this.Salary = Salary;
        System.out.println("\n Salary : \t"+this.Salary);
    }
}

class Call extends SimpleIn {
   

   public static void main(String args[]){
    Scanner scn = new Scanner(System.in);   
	Call obj = new Call();
    String Name;
    System.out.println("Enter Name");
    Name = scn.next();
    float Salary = 0;
    System.out.println("Enter Salary");
    Salary = scn.nextFloat();
    obj.getName(Name);
    obj.getSalary(Salary);
}
}