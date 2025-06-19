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
        while (true) {
            String str = dis.readUTF();
            String isPalindrome = isPalindrome1(str);
            // System.out.println(" " + msg);
            dos.writeUTF(isPalindrome);
            if (str.equalsIgnoreCase("Close")) {
                break;
            }
        }
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }

    public static String isPalindrome1(String msg) {
        System.out.println("Message" + msg);
        String revMsg = "";
        for (int i = (msg.length() - 1); i >= 0; i--) {
            revMsg = revMsg + msg.charAt(i);
        }
        if (revMsg.equalsIgnoreCase(msg)) {
            return "isPalindrome";
        } else {
            return "NotPalindrome";
        }

    }
}