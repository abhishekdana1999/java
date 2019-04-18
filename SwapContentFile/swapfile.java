import java.io.*;
import java.io.BufferedWriter;

public class swapfile {

    public void copy(String a, String b) {
        try {
            char temp = 'a';
            FileReader br = new FileReader(a);
            FileWriter bw = new FileWriter(b);
            while (temp != (char) -1) {
                temp = (char) br.read();
                bw.write(temp);
                 
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        swapfile s = new swapfile();
        s.copy("first.txt", "temp.txt");
        s.copy("second.txt", "first.txt");
        s.copy("temp.txt", "second.txt");
    }
}