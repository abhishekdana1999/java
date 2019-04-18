import java.util.*;

import sun.reflect.Reflection;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        
        v.addElement(1);
        v.addElement(2);
        v.addElement(4);
        v.addElement(3);
        v.addElement(4);
        v.setSize(10);
        System.out.println(v.size() + "\n" + v.capacity());
        Vector<String> vs = new Vector<String>(2);

        vs.addElement("Abhi");
        vs.addElement("obj");
        System.out.println(vs.firstElement());
        System.out.println(vs.size());
        vs.remove(1);    
        System.out.println(vs.size());
        System.out.print(v.equals(10));

    }
}