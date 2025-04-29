package exp6;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Client Application
public class HandshakeClient {

    public static void main(String[] args) {
        String host = "192.168.7.9"; // Replace with actual server IP like "192.168.1.10"
        try {
            // Get the registry from the server host
            Registry registry = LocateRegistry.getRegistry(host);

            // Lookup the remote object
            Handshake stub = (Handshake) registry.lookup("HandshakeService");

            // Call the remote method
            String response = stub.sayHello();
            System.out.println("Response from server: " + response);

        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
        }
    }
}
