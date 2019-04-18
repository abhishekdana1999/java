import java.net.*;
import java.util.*;

import javafx.scene.control.TextField;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server extends Frame {
  static Button B1;
  static TextArea T, T2;

  public static void main(String args[]) throws Exception {
    Frame F1 = new Frame();
    F1.setTitle("Server");
    F1.setBounds(100, 100, 100, 100);
    F1.show();
    B1 = new Button("Send");
    B1.setBounds(100, 150, 100, 80);
    T = new TextArea();
    T2 = new TextArea();
    T.setBounds(150, 150, 50, 80);
    F1.add(T);
    F1.add(T2);
    F1.add(B1);

    ServerSocket soc = new ServerSocket(2222);
    Socket s = soc.accept();
    DataInputStream ds = new DataInputStream(s.getInputStream());

    String st = ds.readUTF();
    String st2 = ds.readUTF();
    T.setText(st);
    T2.setText(st2);
    DataOutputStream Dos = new DataOutputStream(s.getOutputStream());
    B1.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        try {
          String Resp = T.getText();
          Dos.writeUTF(Resp);
          s.close();
        } catch (Exception err) {
          System.out.print(err);
        }
      }
    });

  }
}