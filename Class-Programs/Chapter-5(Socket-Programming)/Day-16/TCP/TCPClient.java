package socketprogramming;
import java.net.*;
import java.io.*;
public class TCPClient {
    public static void main(String[] args) throws Exception
    {
        //        Creating a new object of ServerSocket with Port Number 9999
        Socket socket=new Socket("localhost", 9999);             //9999 is a port number
//        if connection is succesful
        System.out.println("Server is Connected."+ socket);
//        Closing the server
//        server.close();
       DataOutputStream out=new DataOutputStream(socket.getOutputStream());
       out.writeUTF("Hello, Server.");
       out.flush();
       out.close();
//        Closing the server
        socket.close();
    }
}
