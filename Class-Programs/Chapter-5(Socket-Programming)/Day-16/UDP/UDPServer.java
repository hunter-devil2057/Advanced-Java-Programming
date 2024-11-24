package udp;
import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws Exception
    {
        DatagramSocket socket=new DatagramSocket(8888);     //Here, 8888 is a portnumber
        //Checking whether the server is running or not
        System.out.println("Server is Running.....");
        
        byte[] byteData=new byte[100];
        DatagramPacket packet=new DatagramPacket(byteData, byteData.length);
        socket.receive(packet);
        String msg=new String(packet.getData());
        System.out.println("Client Message"+msg);
        
        socket.close();
    }
}
