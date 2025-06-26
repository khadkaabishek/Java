import java.net.*;

public class URLProcess {
    public static void main(String[] args) throws Exception {
        URL url = new URL("ftp://abishek-khadka.com.np/project/day?title=agri#ncit");
        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Hostname : " + url.getHost());
        System.out.println("Port : " + url.getPort());
        System.out.println("Default Port : " + url.getDefaultPort());
        System.out.println("Authority : " + url.getAuthority());
        System.out.println("Path : " + url.getPath());
        System.out.println("File : " + url.getFile());
        System.out.println("Query String : " + url.getQuery());
        System.out.println("Reference : " + url.getRef());
    }
}
