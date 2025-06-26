import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        Registry reg = LocateRegistry.createRegistry(5001);
        reg.bind("Example", obj);
    }
}
