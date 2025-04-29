package exp5;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5000;
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started and waiting for client connection...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Get input stream to receive data
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Read the message from client
            String message = reader.readLine();
            System.out.println("Message received from client: " + message);

            // Close resources
            reader.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
