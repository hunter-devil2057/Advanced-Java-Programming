package socketprogramming;
import java.net.*;
import java.io.*;

public class TCPServer 
{
    public static void main(String[] args) throws Exception
    {
//        Creating a new object of ServerSocket with Port Number 9999
        ServerSocket server=new ServerSocket(9999);             //9999 is a port number
//        Returing Socket Details, after acception 
        Socket socket=server.accept();
//        If no error is seen
        System.out.println("Client is Connected. "+socket);
        DataInputStream input=new DataInputStream(socket.getInputStream());
        String message=(String) input.readUTF();
        System.out.println("Client Message: "+message);
        server.close();
        socket.close();
    }
}
