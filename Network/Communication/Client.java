import java.net.*;
import java.io.*;

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
        dos.writeUTF("hello sir ");
        // System.out.println("Client Says : " + msg);
        // dos.writeUTF(msg.toUpperCase());
        System.out.println("Reply from server : " + dis.readUTF());
        dos.close();
        dis.close();
        s.close();
        // ss.close();
    }
}