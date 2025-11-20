import java.net.*;
import java.io.*;
import java.util.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5202);
        Socket s = ss.accept();
        Scanner scan = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            String msg = dis.readUTF();
            System.out.println("Client Says : " + msg);
            if (msg.equalsIgnoreCase("bye")) {
                break;
            }
            System.out.println("Enter what to send Back");
            String sendMsg = scan.nextLine();
            dos.writeUTF(sendMsg);
        }
        dos.close();
        dis.close();
        scan.close();
        s.close();
        ss.close();
    }
}