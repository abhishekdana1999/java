
import java.util.*;

class ThreadOne extends Thread 
{
    
    public void run()
    {
        System.out.println();
        System.out.println("Random");
        for(int i = 0;i<=100;i++)
        {
             System.out.print(i + " ");
        }
        System.out.println("Thread One Finish");

        
    }

    
   
}

class ThreadTwo extends Thread
{
    public void run()
    {
        System.out.println();
        System.out.println("Even Numbers");
        for(int i = 0;i<=100;i++)
        {
             if(i%2==0)
             {
                 System.out.print(i + " ");
             }
        }
        System.out.println("Thread Two Finish");
    }
 
}

public class ThreadDemo 
{
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t2.start();
        t1.start();
        
    }
}