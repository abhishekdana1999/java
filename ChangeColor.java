import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends Frame
{
    Button B1 , B2 , B3 , B4;
    Graphics gs;
    ChangeColor()
    {
        B1 = new Button("Green");
        B2 = new Button("Red");
        B3 = new Button("Line");
        B4 = new Button("box");
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        setLayout(new FlowLayout());
        this.setTitle("ChangeColor");
        this.setSize(400 , 400);
        this.show();
        B1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.GREEN);   
            }
        });
        B2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        });
        B3.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                gs = getGraphics();
                gs.setColor(Color.GRAY);
                gs.drawLine(10, 10, 50, 50);
            }
        });
        B4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gs = getGraphics();
                gs.setColor(Color.GRAY);
                gs.drawRect(50, 50, 100, 80);
            }
        });
    }


    public static void main(String[] args) {
        ChangeColor cc = new ChangeColor();
    }
}