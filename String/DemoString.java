import java.util.*;

public class DemoString {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat(" how are you");
        System.out.println(s1);

        String s2 = "hello";
        String s3 = "hello";

        System.out.println(s2.compareTo(s3));

        String s4 = "";
        String s5 = "Hello";

        System.out.println(s4.isEmpty());
        System.out.println(s5.isEmpty());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s5.charAt(2));
        System.out.println(s5.trim() + " " + "how are you");

        int value = 20;
        String s6 = String.valueOf(value);
        System.out.println(s6 + 17);
        System.out.println(s5.replace('H', 'T'));        
    }
}