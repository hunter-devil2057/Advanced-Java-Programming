package udp;
import java.net.*;
public class UDPClient
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket socket=new DatagramSocket();     //Here, 8888 is a port number
//        For Addrss
        InetAddress address=InetAddress.getByName("localhost");
        String message="Hello, Server.";
        byte[] byteData=message.getBytes();
//        Creating packet
        DatagramPacket packet=new DatagramPacket(byteData, byteData.length, address, 8888);//here, address means port address
        socket.send(packet);
        socket.close();
    }
}
