import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Criptografia extends java.rmi.Remote {
    public String criptografar ( String a ) throws java.rmi.RemoteException;
    public String descriptografar ( String a ) throws java.rmi.RemoteException;
}