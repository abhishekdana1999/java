
import javax.swing.*;

import javafx.scene.control.DialogPane;

public class MyDialog {

    MyDialog() {
        String str = JOptionPane.showInputDialog(this, "OK");
        JOptionPane.showMessageDialog(null, str, str, 1);
        // JOptionPane.showMessageDialog(null, this, str, 0);
    }

    public static void main(String[] args) {

        new MyDialog();

    }
}