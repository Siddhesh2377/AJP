package exp3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get and display the local host address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local Host Address: " + localHost.getHostAddress());

            System.out.println();

            // Get and display the address of a specific website
            String website = "www.google.com";
            InetAddress webAddress = InetAddress.getByName(website);
            System.out.println("Website Name: " + website);
            System.out.println("IP Address: " + webAddress.getHostAddress());

            System.out.println();

            // Get and display all IP addresses associated with the website
            InetAddress[] addresses = InetAddress.getAllByName(website);
            System.out.println("All IP Addresses associated with " + website + ":");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
