
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;

public class KeyDemo1 extends Frame implements KeyListener {

    Label l1;
    TextArea tf1;

    KeyDemo1() {
        l1 = new Label("ENter String");
        tf1 = new TextArea();

        l1.setBounds(20, 30, 70, 30);
        tf1.setBounds(20, 50, 80, 40);
        add(l1);
        add(tf1);
        tf1.addKeyListener(this);

    }

    public void keyTyped(KeyEvent e) {
        tf1.setText("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        tf1.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        tf1.setText("Key Released");
    }

    public static void main(String[] args) {
        KeyDemo1 kd = new KeyDemo1();
        kd.setTitle("KeyDemo");
        kd.setSize(400, 200);
        kd.setVisible(true);

    }

}