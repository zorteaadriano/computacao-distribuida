import java.rmi.*;
import java.net.MalformedURLException;


public class ServidorCriptografia {

    public ServidorCriptografia() {
        try{
            Criptografia obj = new CriptografiaImpl();
            Naming.rebind("criptoServer", obj);
        }
        catch( Exception e){
            System.out.println("Erro: "+e);
        }
    }

    public static void main(String[] args){
        new ServidorCriptografia();
    }
}