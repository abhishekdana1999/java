import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket soc = new ServerSocket(2222);
        Socket S = soc.accept();
        System.out.println("waiting..");
        DataInputStream dis = new DataInputStream(S.getInputStream());
        DataOutputStream dos = new DataOutputStream(S.getOutputStream());
        while (true) {
            String input1 = dis.readUTF();
            String op = dis.readUTF();
            String input2 = dis.readUTF();
            if (input1.equals("bye"))
                break;
            System.out.println("Equation received:-" + input1 + " " + op + " " + input2);
            int result;

            if (op.equals("+")) {
                result = Integer.parseInt(input1) + Integer.parseInt(input2);
            } else if (op.equals("-")) {
                result = Integer.parseInt(input1) - Integer.parseInt(input2);
            } else if (op.equals("*")) {
                result = Integer.parseInt(input1) * Integer.parseInt(input2);
            } else {
                result = Integer.parseInt(input1) / Integer.parseInt(input2);
            }
            System.out.println("Sending the result...");
            dos.writeUTF(Integer.toString(result));
            dos.close();
            dis.close();
            S.close();
            soc.close();
        }
    }
}
