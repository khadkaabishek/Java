import java.net.*;

class Example {
    public static void main(String[] args) throws Exception {
        // 1st
        InetAddress pou = InetAddress.getByName("www.pu.edu.np");
        System.out.println("Host name = " + pou.getHostName());
        System.out.println("IP= " + pou.getHostAddress());
        // 2nd
        InetAddress[] netflix = InetAddress.getAllByName("www.netflix.com");
        for (InetAddress n : netflix) {
            System.out.println("IP= " + n.getHostAddress());
        }

    }
}