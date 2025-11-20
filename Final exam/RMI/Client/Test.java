
import java.rmi.*;
import java.rmi.registry.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.getRegistry("localhost", 2010);
        Common obj = (Common) reg.lookup("myObject");
        System.out.println("The number is :" + (String) obj.checkMyfunction(2));
    }
}
