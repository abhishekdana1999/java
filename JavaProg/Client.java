import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client extends Frame {
    static Button B1;
    static TextArea Ta, Ta2;

    public static void main(String args[]) throws Exception {
        Socket s = new Socket("192.168.88.1", 2222);
        DataOutputStream Dos = new DataOutputStream(s.getOutputStream());
        Frame f1 = new Frame();
        f1.setTitle("Client");
        f1.setSize(400, 400);

        f1.setVisible(true);
        Ta = new TextArea();
        Ta2 = new TextArea();
        Ta.setBounds(10, 30, 100, 100);
        Ta2.setSize(100, 100);
        B1 = new Button("Send");
        B1.setBounds(10, 60, 50, 100);
        f1.add(Ta);
        f1.add(Ta2);
        f1.add(B1);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Value1 = Ta.getText();
                String Value2 = Ta2.getText();
                try {
                    Dos.writeUTF(Value1);
                    Dos.writeUTF(Value2);
                    Ta.setText("Sent");
                } catch (IOException err) {
                    System.out.println(err);
                }
            }
        });

        DataInputStream ds = new DataInputStream(s.getInputStream());
        String resp = ds.readUTF();
        System.out.println(resp);
        ds.close();
        Dos.close();
        s.close();
        f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}