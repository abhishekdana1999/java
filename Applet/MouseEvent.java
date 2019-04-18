Field tf1;
    int enter = 0;

    public void init()
    {
        tf1 = new TextField(25);
        addMouseListener(this);
        add(tf1);
    }
 

    public void 
    
    public void mouseClicked(java.awt.event.MouseEvent e) {
        
        
        System.out.println("-");
        tf1.setText(String.valueOf(enter));

        enter++;
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
       // System.out.println("Mouse Pressed");
    }

    
    public void mouseReleased(java.awt.event.MouseEvent e) {
      //  System.out.println("Mouse Released");
    }

    
    public void mouseEntered(java.awt.event.MouseEvent e) {
      //  System.out.println("Mouse Entered");
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
      //  System.out.println("Mouse Exited");
    }
    
}