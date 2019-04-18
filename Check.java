import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Check
{
    static Checkbox ch1 , ch2;
    static Label l;
   
    public static void main(String[] args) {
        Frame F1 = new Frame();
        GridLayout gl = new GridLayout(2,2);
        F1.setTitle("CheckBox");
        F1.setLayout(gl);
        
       
        ch1 = new Checkbox("Cricket");
        ch2 = new Checkbox("Reading");
        l = new Label("Hobby");
        
        gl.setHgap(5);
        gl.setVgap(5);

        ch1.setBounds(100,100,50,50);
        ch2.setBounds(100,150,50,50);
        F1.add(l);
        F1.add(ch1);
        F1.add(ch2);
        ch1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                    if(e.getSource()==ch1)
                    {
                        if(ch1.getState() == true)
                        {
                            System.out.println("Cricket");
                        }
                    }

                   
            }
        });
        ch2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                    if(e.getSource() == ch2)
                    {
                        if(ch2.getState()==true)
                        {
                            System.out.println("Reading");
                        }
                    }
            }
        });

        F1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println(e);
                System.exit(0);
            }
        });
        F1.setSize(300, 300);
        F1.setVisible(true);
    }
}