import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message in lowercase");
        String msg = scan.next();
        byte[] sendBuffer = msg.getBytes();
        InetAddress serverIp = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverIp, 5001);
        ds.send(sendPacket);
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receiPacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        ds.receive(receiPacket);
        String data = new String(receiPacket.getData());
        System.out.println("Data : " + data);
        ds.close();
    }

}
