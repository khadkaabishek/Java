import java.net.*;

public class Server {   
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5001);
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        ds.receive(receivePacket);
        String msg = new String(receivePacket.getData());

        System.out.println("Client Says : " + msg);
        byte[] sendBuffer = msg.toUpperCase().getBytes();
        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
        ds.send(sendPacket);
        ds.close();
    }
}
