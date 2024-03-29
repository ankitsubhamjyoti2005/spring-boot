import java.io.*;
import java.net.*;

public class server{
    public void run(){
        int port = 1800;
        try{
            ServerSocket socket = new ServerSocket(port);
            socket.setSoTimeout(1000000);
            while (true) {
                try{
                    System.out.println("server is lishen on port"+port);
                    Socket acceptedConnection = socket.accept();
                    System.out.println("connection accept from the client"+acceptedConnection.getRemoteSocketAddress());
                    PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
                    BufferedReader fromClent = new BufferedReader(new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream())));
                    toClient.println("hello from server");
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }catch(Exception c){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        server server = new server();
        try{
            server.run();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

