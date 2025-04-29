package exp4;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.MalformedURLException;

public class URLandURIExample {
    public static void main(String[] args) {
        try {
            // Working with URI
            System.out.println("----- URI Example -----");
            URI uri = new URI("https://www.example.com:8080/index.html?name=student#section1");

            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());

            System.out.println();

            // Working with URL
            System.out.println("----- URL Example -----");
            URL url = new URL("https://www.example.com:8080/index.html?name=student#section1");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
            System.out.println("External Form (toString()): " + url.toExternalForm());

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
