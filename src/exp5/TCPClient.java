package exp5;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // or server IP address
        int port = 5000;

        try {
            // Create socket and connect to server
            Socket socket = new Socket(hostname, port);
            System.out.println("Connected to the server.");

            // Get output stream to send data
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Send a text message
            String textMessage = "Hello Server, this is Client!";
            writer.println(textMessage);

            System.out.println("Message sent to server: " + textMessage);

            // Close resources
            writer.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
