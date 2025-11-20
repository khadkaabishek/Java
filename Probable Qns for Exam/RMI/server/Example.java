import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Example extends UnicastRemoteObject implements CommonInterface {
    public Example() throws RemoteException {
    }

    public int heckSend(int num) {
        if (num % 2 == 1) {
            return 1;
        } else {

            return 2;
        }
    }
}
