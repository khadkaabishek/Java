import java.rmi.RemoteException;
import java.rmi.registry.*;

public class Binder {
    public static void main(String[] args) throws RemoteException {

        CalcImp obj = new CalcImp();
        Registry reg = LocateRegistry.createRegistry(2010);
        reg.rebind("myObject", obj);
        System.out.println("Server Running");
    }
}
