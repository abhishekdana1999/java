import java.io.*;
import java.util.*;

public class FileDemo {

    public static void main(String args[]) throws Exception {
        RandomAccessFile ra = new RandomAccessFile("abc.txt", "rw");
        int a = 23;
        ra.writeInt(+a);
        float b = 23.4f;
        ra.writeFloat(b);
        ra.close();
        RandomAccessFile r = new RandomAccessFile("abc.txt", "rw");
        r.seek(0);
        int z = r.readInt();
        System.out.println(z);
        // r.seek(1);
        float x = r.readFloat();
        System.out.println(x);

    }
}