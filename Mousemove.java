import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Mousemove extends Applet implements MouseMotionListener {

    int x, y , value , q;
    Graphics gs;
Random Rd;
Color c;
    public void init()
    {
        Rd = new Random();
        
        addMouseMotionListener(this);
    }

    
    public void mouseMoved(MouseEvent e) {

        try{
        float r = Rd.nextFloat();
        float g = Rd.nextFloat();
        float b = Rd.nextFloat();
        
        c = new Color(r , g , b);
        x = e.getX();
        y = e.getY();
        gs = getGraphics();
        gs.setColor(c);
        gs.drawLine(x, y, x+5, y+5);    
        
        }
        catch(Exception ex)
        {
        
        }
    }

    public void mouseDragged(MouseEvent e) {
        try{

            float r = Rd.nextFloat();
            float g = Rd.nextFloat();
            float b = Rd.nextFloat();
            value = q % 255;
            Color randomColor = new Color(r, g, b);
            x = e.getX();
            y = e.getY();
            gs = getGraphics();
            
            gs.setColor(randomColor);
            gs.drawOval(x, y, 50, 50);
        }

 catch (Exception ex) {
    //TODO: handle exception
}

    }

}