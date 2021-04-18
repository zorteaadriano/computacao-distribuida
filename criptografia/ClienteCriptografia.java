import javax.swing.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;

public class ClienteCriptografia{

    public static void main (String[] args){
        String A, resp = "";

        int opcao = JOptionPane.showConfirmDialog(null, "Sim = Criptografia" +
        "\nNao = Descriptografia", "Escolha uma opcao", 0);

        try{
            Criptografia cripto = (Criptografia) Naming.lookup("localhost/criptoServer");

            if(opcao == 0){
                A = JOptionPane.showInputDialog("Entre com o texto. Sem acento");
                resp = cripto.criptografar(A);
            }else{
                A = JOptionPane.showInputDialog("Entre com o texto. Sem acento");
                resp = cripto.descriptografar(A);
            }
        }

     

        catch (RemoteException re){
            System.out.println();
            System.out.println("RemoteException");
            System.out.println(re);
        }

        catch (NotBoundException nbe){
            System.out.println();
            System.out.println("NotBoundException");
            System.out.println(nbe);
        }

         catch (MalformedURLException me){
            System.out.println();
            System.out.println("MalformedURLException");
            System.out.println(me);
        }

        catch (java.lang.ArithmeticException ae){
            System.out.println();
            System.out.println("java.lang.ArithmeticException");
            System.out.println(ae);
        }

        catch (java.lang.StringIndexOutOfBoundsException str){
            System.out.println();
            System.out.println("java.lang.StringIndexOutBoundsException");
            System.out.println(str);
        }

        catch (java.lang.ArrayIndexOutOfBoundsException arr){
            System.out.println();
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            System.out.println(arr);
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(resp);

        JOptionPane.showMessageDialog(null, outputArea, "Texto Criptografado", JOptionPane.INFORMATION_MESSAGE);



    }


}