import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener
{
    MenuBar mb = new MenuBar();
        Menu m = new Menu("File");
        MenuItem mI1,mI2,mI3;
       
        
    MenuDemo()
    {
        mI1 = new MenuItem("First");
        mI2 = new MenuItem("Second");
        mI3 = new MenuItem("Third");
        mI1.addActionListener(this);
        mI2.addActionListener(this);
        mI3.addActionListener(this);
        m.add(mI1);
        m.add(mI2);
        m.add(mI3);
        mb.add(m);
        this.setMenuBar(mb);
        this.setTitle("abcd");
        this.setSize(300, 300);
        this.show();
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mI1)
        {
            System.out.println("First");
        }
        else if(e.getSource() == mI2)
        {
            System.out.println("Second");

        }
        else if(e.getSource() == mI3)
        {
            System.out.println("Third");

        }
        else
        {
            System.out.println("None Selected");
        }
    }


    public static void main(String[] args) {
        MenuDemo m = new MenuDemo();
       // Frame f = new Frame();

        //f.setTitle("Menu");
    }
   
}