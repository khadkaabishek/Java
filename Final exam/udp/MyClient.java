import java.net.*;
import java.io.*;

public class MyClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        // Sending ...
        String msg = "Who are You ? ";
        byte[] sendBuffer = msg.getBytes();
        InetAddress clientAddress = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress,
                5003);
        ds.send(sendPacket);

        // Receiving ...
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        ds.receive(receivePacket);
        System.out.println("Server Says : " + new String(receivePacket.getData()));
        ds.close();
    }
}