
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame {
    JButton btn;
    public static void main(String args[]) {
        GUI mf = new GUI();

        mf.setTitle("Frame");
        mf.setSize(300,300);
        mf.show();

    }   
    
    GUI(){
        btn = new JButton("Button");
     
        btn.setBounds(130,100,100,40);
        add(btn);
        btn.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
    }
}