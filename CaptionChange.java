import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaptionChange extends Frame{
    Button B1;
    CaptionChange()
    {
        B1 = new Button("OK");
        B1.setBounds(100,100,50,50);
        add(B1);
        this.setTitle("Frame");
        this.setSize(200,200);
        this.show();
        B1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
              B1.setLabel("KO");
            }
        });
    }

    public static void main(String[] args) {
        CaptionChange cc = new CaptionChange();
    }
}
