import java.net.*;
import java.io.*;
import java.util.*;

class Client {
    public static void main(String[] args) throws Exception {
        // ServerSocket ss = new ServerSocket(5001);
        // System.out.println("Server running on Port" + 5001);
        Socket s = new Socket("localhost", 5001);
        // System.out.println("Client connected with IP : " + s.getInetAddress() + "Port
        // : " + s.getPort());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        // String msg = dis.readUTF();
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your message to check whether it is palindrome or not ");
            String msg = scan.next();

            dos.writeUTF(msg);
            System.out.print("msg : " + msg);
            // System.out.println("Client Says : " + msg);
            // dos.writeUTF(msg.toUpperCase());
            System.out.println("Your message is : " + dis.readUTF());
            if (msg.equalsIgnoreCase("Close")) {
                break;
            }
        }

        dos.close();
        dis.close();
        s.close();
        // ss.close();
    }
}