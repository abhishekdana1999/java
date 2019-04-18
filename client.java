import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws Exception {
        Socket S = new Socket("localhost", 2222);
        DataInputStream dis = new DataInputStream(S.getInputStream());
        DataOutputStream ds = new DataOutputStream(S.getOutputStream());
        while (true) {
            System.out.print("Enter the equation in the form: ");
            System.out.println("'operand'");
            Scanner sc = new Scanner(System.in);
            String inp1 = sc.next();
            System.out.println(("'operator'"));
            String inpo = sc.next();
            System.out.println(("'operand'"));
            String inp2 = sc.next();
            if (inp1.equals("bye"))
                break;
            ds.writeUTF(inp1);
            ds.writeUTF(inpo);
            ds.writeUTF(inp2);
            String ans = dis.readUTF();
            System.out.println("Answer=" + ans);
            ds.close();
            dis.close();
            S.close();
        }
    }
}
