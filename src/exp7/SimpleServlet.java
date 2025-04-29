package exp7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet Annotation
@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Initialization code
        System.out.println("Servlet is being initialized");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Get the output stream to write the response
        PrintWriter out = response.getWriter();

        // Write response
        out.println("<html><body>");
        out.println("<h1>Welcome to Simple Servlet Example!</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        // Cleanup code
        System.out.println("Servlet is being destroyed");
    }
}
