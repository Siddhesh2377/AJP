package exp9;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Fetching the name from request
        String name = request.getParameter("username");

        // Writing the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("</body></html>");
    }
}
