import java.net.*;


import java.io.*;

public class socketprog {

    public static void main(String[] args) throws Exception {
        ServerSocket soc = new ServerSocket(2222);
        Socket s = soc.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int str = dis.readInt();
        int str1 = dis.readInt();
        int ans = str + str1;
        System.out.println(ans);
        DataOutputStream Dos = new DataOutputStream(s.getOutputStream());
        Dos.writeInt(ans);
        Dos.close();
        s.close();
    }

}