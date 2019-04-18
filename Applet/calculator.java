import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class calculator extends Applet implements ActionListener
{
    Label list1,list2,list3;
    Button button1,button2,button3,button4;
    TextField text1,text2,text3;

public void init()
{
    list1=new Label("Enter Number 1: ");
    list2=new Label("Enter Number 2:");
    list3=new Label("Enter Number 3:");
   
    text1=new TextField();
    text2=new TextField();
    text3=new TextField();
    text1.setColumns(10);
    text2.setColumns(10);
    text3.setColumns(10);
    text2.setSize(15, 10);
    text3.setSize(15, 10);
    button1=new Button("+");
    button2=new Button("-");
    button3=new Button("*");
    button4=new Button("/");
    add(list1);
    add(text1);
    add(list2);
    add(text2);
    add(button1);
   
    add(button2);
    add(button3);
    add(button4);
    add(list3);
    add(text3);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
    String S1,S2,S3;
    int result;
    S1=text1.getText();
    S2=text2.getText();
    int a=Integer.parseInt(S1);
    int b=Integer.parseInt(S2);
if(e.getSource()==button1)
{
    result=a+b;
    text3.setText(String.valueOf(result));
}

else if(e.getSource()==button2)
{
    result=a-b;
    text3.setText(String.valueOf(result));
}
else if(e.getSource()==button3)
{
    System.out.println(e.getSource()==button3);
    result=a * b;
    text3.setText(String.valueOf(result));
}
else if(e.getSource()==button4)
{
    System.out.println(e.getSource()==button4);
    result=a/b;
    text3.setText(String.valueOf(result));
}
else 
{
    text3.setText("0");
}

}
}