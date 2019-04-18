import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class RadioDemo extends Frame {
   CheckboxGroup Cg;
   Checkbox r,g,b;
   RadioDemo()
   {
       Cg = new CheckboxGroup();
      
       r = new Checkbox("Red" , Cg , true);
       g = new Checkbox("Green" , Cg , false);
       b = new Checkbox("Blue" , Cg , false); 
       this.setLayout(new FlowLayout());
       add(r);
       add(g);
       add(b);
       r.addItemListener(new ItemListener(){
           
           public void itemStateChanged(ItemEvent e) {
            
               if(e.getSource() == r)
               {
                setBackground(Color.RED);    
               }
           }
       });
       g.addItemListener(new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent e) {
               if(e.getSource() == g)
               {
                setBackground(Color.GREEN);
               }
           }
       });
       b.addItemListener(new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent e) {
               if(e.getSource() == b)
               {
                setBackground(Color.BLUE);
               }
           }
       });
       this.setTitle("RadioDemo");
       this.setSize(400,400);
       this.show();
       this.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e)
           {
               System.exit(0);
           }
       });
   }

  

   public static void main(String[] args) {
       RadioDemo R1 = new RadioDemo();
   }
}