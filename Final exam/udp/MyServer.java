import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5003);

        // Receiving ...
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        ds.receive(receivePacket);
        System.out.println("Client Says : " + new String(receivePacket.getData()));

        // Sending ...
        String msg = "I am Abishek";
        byte[] sendBuffer = msg.getBytes();
        InetAddress clientAddress = receivePacket.getAddress();
        System.out.println("PORTT" + receivePacket.getPort());
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress,
                receivePacket.getPort());
        ds.send(sendPacket);
        ds.close();
    }
}