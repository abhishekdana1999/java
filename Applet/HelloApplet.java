import java.applet.*;
import java.util.*;
import java.awt.*;



public class HelloApplet extends Applet {

   
    public void init()
    {
        System.out.println("Init");
        
    }

    public void start()
    {
        System.out.println("Started");
    }

    public void stop()
    {
        System.out.println("Stop");
    }

    public void destroy()
    {
        System.out.println("Destroy");
    }

    public void paint(Graphics g)
    {
        System.out.println(Integer.parseInt(getParameter("value1")) + Integer.parseInt(getParameter("value2")));
        g.drawString(String.valueOf(Integer.parseInt(getParameter("value1")) + Integer.parseInt(getParameter("value2"))), 100, 100); 
        
    }
    
   

    
}