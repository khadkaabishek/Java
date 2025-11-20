import java.rmi.*;
interface Common extends Remote{
    public String check(int num) throws Exception; 
}