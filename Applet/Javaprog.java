import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Javaprog extends Applet implements ActionListener {
    Button btn1;
    Button btn2;
    Graphics g;

    public void init() {
        btn1 = new Button("Button1");
        btn2 = new Button("Button2");

        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void paintReact() {

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand() == "Button1") {
            paintReact();
        } else {
            setBackground(Color.RED);
        }
    }
}