import java.rmi.Remote;

public interface CommonInterface extends Remote {
    public int heckSend(int num) throws Exception;
}
