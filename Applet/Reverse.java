import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;


public class Reverse extends Applet implements ActionListener {
        
        TextField tf1 , tf2;
   
        Button b1;
        
        char ch;
        public void init()
        {
            tf1 = new TextField(25);
            tf2 = new TextField(25);
          
            b1 = new Button("Reverse");
           add(tf1);
           add(tf2);
           add(b1);
           
           b1.addActionListener(this);
        } 
	public void actionPerformed(ActionEvent e) {
        String st1=new String();
        String st2=new String();
        int index;
        st1 = tf1.getText();
       
            for(index = st1.length() - 1; index >= 0; index--)
            {
                
                st2 = st2 + st1.charAt(index); 
            }
            tf2.setText(st2);
        
	}

    
}