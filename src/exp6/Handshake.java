package exp6;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote Interface
public interface Handshake extends Remote {
    String sayHello() throws RemoteException;
}
