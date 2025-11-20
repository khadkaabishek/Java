import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class CalcImp extends UnicastRemoteObject implements Common {
    public CalcImp() throws RemoteException {
        super();
    }

    @Override
    public String checkMyfunction(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}