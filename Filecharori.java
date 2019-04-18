import java.util.*;
import java.io.*;

public class Filecharori {
    
    public static void main(String args[]) throws Exception
    {
        char ch = 'a';
        FileReader FR = new FileReader("abc.txt");
        FileWriter FW = new FileWriter("Two.txt");
       while(ch != (char)-1)
       {
         
            ch = (char)FR.read();
              FW.write(ch);
        
           System.out.print(ch);
       }
        
FR.close();
      FW.close();
    }

}