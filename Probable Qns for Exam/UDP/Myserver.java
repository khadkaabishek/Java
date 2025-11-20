import java.net.*;

public class Myserver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        ds.receive(receivePacket);
        String receiveMsg = new String(receivePacket.getData());
        System.out.println("Received msg : " + receiveMsg);

        String sendMsg = receiveMsg.toUpperCase();
        byte[] sendBuffer = sendMsg.getBytes();
        InetAddress clientIp = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientIp, clientPort);
        ds.send(sendPacket);
        ds.close();
    }
}