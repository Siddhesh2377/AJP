package exp6;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// Server Implementation
public class HandshakeServer implements Handshake {

    public HandshakeServer() {}

    public String sayHello() {
        return "Hello, client! Handshake successful.";
    }

    public static void main(String[] args) {
        try {
            // Create an instance of the server
            HandshakeServer obj = new HandshakeServer();

            // Export the remote object to receive calls
            Handshake stub = (Handshake) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099); // Start registry on port 1099
            registry.rebind("HandshakeService", stub);

            System.out.println("Server ready. Waiting for client handshake...");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}
