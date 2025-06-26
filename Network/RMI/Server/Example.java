import java.rmi.*;
import java.rmi.server.*;

public class Example extends UnicastRemoteObject implements CommonInterface {
    public Example() throws RemoteException {
        super();
    }

    public int checkSend(int a, int b) {
        if ((a % 2 == 0) && (b % 2 == 0)) {
            return (int) Math.pow((a + b), 2);
        }
        return (int) Math.pow((a + b), 3);
    }

}
