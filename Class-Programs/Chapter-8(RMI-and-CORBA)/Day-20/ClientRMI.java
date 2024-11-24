//package chapter8;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientRMI {
//    Creating a Constructor
    public ClientRMI(){}
    
    public static void main(String[] args)
    {
        try
        {
            // Getting the Registry List
            Registry registry=LocateRegistry.getRegistry();
            //      Lookup the registry for remote object
            Adder stub= (Adder)registry.lookup("csit");
            int sum=stub.add(2, 3);
            System.out.println("Result: "+sum);
        }
        catch(Exception ex)
        {
                System.out.println(ex);
         }
    }
    
}
