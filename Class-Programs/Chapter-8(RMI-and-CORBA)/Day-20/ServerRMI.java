//package chapter8;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ServerRMI  extends AdderRemote
{
//    Defining a Default Constructor
    public ServerRMI()
    {
    }
    public static void main(String[] args)
    {
        try
        {
            AdderRemote obj=new AdderRemote();
            Adder skeleton=(Adder)UnicastRemoteObject.exportObject(obj, 0);
            Registry registry=LocateRegistry.getRegistry();
            registry.bind("csit", skeleton);
            System.out.println("Server is ready to go...");
        }
        catch(Exception ex)
        {
                    System.out.println(ex);
                    System.err.println("Server exception: " + ex.toString());
                    ex.printStackTrace();
        }
    }
}
