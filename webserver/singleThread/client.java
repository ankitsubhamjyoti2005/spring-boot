
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class client {
    public static void main(String[] args) {
        int port = 8010;
        try {
            InetAddress address = InetAddress.getByName("localhost");
            Socket socket = new Socket(address,port);
            PrintWriter toSocket = new PrintWriter(socket.getOutputStream());
            BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            toSocket.println("hello from the client");
            String line = fromSocket.readLine();
            System.out.println("response from the socket is: "+ line);

            toSocket.close();
            fromSocket.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
