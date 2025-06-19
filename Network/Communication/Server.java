import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5001);
        System.out.println("Server running on Port" + 5001);
        Socket s = ss.accept();
        System.out.println("Client connected with IP : " + s.getInetAddress() + "Port : " + s.getPort());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String msg = dis.readUTF();
        System.out.println("Client Says : " + msg);
        dos.writeUTF(msg.toUpperCase());
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}