import java.rmi.*;

public interface CommonInterface extends Remote {
    public int checkSend(int a, int b) throws Exception;
}
