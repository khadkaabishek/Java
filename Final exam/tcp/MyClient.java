import java.net.*;
import java.io.*;
import java.util.*;

public class MyClient {
    public static void main(String[] args) throws Exception {
        // ServerSocket ss = new ServerSocket(5000);
        Socket s = new Socket("localhost", 5202);
        Scanner scan = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            System.out.println("Enter what to send ");
            String sendMsg = scan.nextLine();
            dos.writeUTF(sendMsg);
            String msg = dis.readUTF();
            System.out.println("Server Says : " + msg);
            if (msg.equalsIgnoreCase("bye")) {
                break;
            }
        }
        dos.close();
        dis.close();
        scan.close();
        s.close();
        // }
    }
}
