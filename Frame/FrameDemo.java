
import java.awt.*;
import java.awt.event.*;

public class FrameDemo  {
    static Label l1, l2;
    static TextField tf1, tf2, tf3;
    static Button b1;

    
    public static void main(String args[]) {

        Frame f1 = new Frame();
        GridLayout gl = new GridLayout(4,2);
        l1 = new Label("First Name : ");
        l2 = new Label("Last Name : ");
        tf1 = new TextField(50);
        tf2 = new TextField(50);
        tf3 = new TextField(50);

        b1 = new Button("First Name");

        
        f1.setTitle("Frame Demo");

        f1.setSize(400, 600);

        f1.setVisible(true);
        f1.setLayout(gl);
        gl.setHgap(5);
        gl.setVgap(5);
        f1.add(l1);
        f1.add(tf1);
        f1.add(l2);
        f1.add(tf2);
        f1.add(b1);
        f1.add(tf3);
        f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    String s1, s2, res;

                    
                    s1 = tf1.getText();
                    s2 = tf2.getText();
                    res = s1 + " " + s2;
                    tf3.setText(res);
                }
            }
        });

        tf2.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                // System.out.println(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int resu = e.getKeyCode();

                if(resu == 10)
                {
                    String s1, s2, res;

                    s1 = tf1.getText();
                    s2 = tf2.getText();
                    res = s1 + " " + s2;
                    tf3.setText(res);
                }
            }
        });

    }

}
