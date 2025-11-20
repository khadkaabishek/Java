import java.net.*;
import java.util.*;

public class Myclient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5001);
        Scanner scan = new Scanner(System.in);
        String sendMsg = scan.nextLine();
        byte[] sendBuffer = sendMsg.getBytes();
        InetAddress servAddress = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, servAddress, 5000);
        ds.send(sendPacket);

        byte[] receiverBuffer = new byte[1024];
        DatagramPacket receivPacket = new DatagramPacket(receiverBuffer, receiverBuffer.length);
        ds.receive(receivPacket);
        String gotMsg = new String(receivPacket.getData());
        System.out.println(gotMsg);
        scan.close();
        ds.close();
    }
}