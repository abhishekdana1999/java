import java.applet.Applet;
import java.util.*;

public class NumberApplet extends Applet {

    public void start() {
        if (Integer.parseInt(getParameter("value1")) > Integer.parseInt(getParameter("value2"))) {
            System.out.print("Error");
        } else {
            for (int i = Integer.parseInt(getParameter("value1")); i <= Integer.parseInt(getParameter("value2")); i++) {
                System.out.println(i);
            }
        }

    }

}