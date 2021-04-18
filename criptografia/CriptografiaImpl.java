import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;

public class CriptografiaImpl extends java.rmi.server.UnicastRemoteObject implements Criptografia{

    public CriptografiaImpl() throws java.rmi.RemoteException{
        super();
    }

    public String criptografar( String a) throws java.rmi.RemoteException{
        char charArray[];
        char charAux=' ';
        String output = "Texto: "+a;
        int tam = a.length();
        charArray = new char[tam];
        output += "\n\nCriptografado: ";

        a.getChars( 0, tam, charArray, 0);

        for (int count = 0; count < charArray.length; count++){
            charAux= 'p';
            charArray[count] = charAux;
            output += charArray[count];
        }

        return output;
    }

    public String descriptografar( String a ) throws java.rmi.RemoteException {

        char charArray[];
        char charAux=' ';
        String output = "Texto Criptografado: "+a;
        int tam = a.length();
        charArray = new char[tam];
        output += "\n\nTexto Legivel: ";
        

        a.getChars( 0, tam, charArray, 0);

        for (int count = 0; count < charArray.length; count++){
            charAux = 'q';
            charArray[count] = charAux;
            output += charArray[count];
        }

        return output;
    }
}