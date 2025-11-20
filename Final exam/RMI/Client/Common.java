
import java.rmi.*;

public interface Common extends Remote {
    public String checkMyfunction(int a) throws RemoteException;

}