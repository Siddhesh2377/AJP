package exp8;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

// Mapping the servlet with URL
@WebServlet("/demo")
public class DemoServlet extends GenericServlet {

    private ServletConfig config;

    // init() method to initialize ServletConfig
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet initialized.");
    }

    // service() method to handle client requests
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Fetching servlet parameter (from web.xml or @WebInitParam)
        String userName = request.getParameter("username");

        // Fetch ServletConfig parameter (can be from web.xml in real apps)
        String configParam = config.getInitParameter("configParam");

        // Accessing ServletContext
        ServletContext context = config.getServletContext();
        String contextParam = context.getInitParameter("contextParam");

        // Building the HTML Response
        out.println("<html><body>");
        out.println("<h2>Servlet Demo: javax.servlet Package Usage</h2>");

        if (userName != null) {
            out.println("<p>Username received from request: " + userName + "</p>");
        } else {
            out.println("<p>No username provided.</p>");
        }

        out.println("<p>ServletConfig Parameter: " + configParam + "</p>");
        out.println("<p>ServletContext Parameter: " + contextParam + "</p>");

        out.println("</body></html>");
    }

    // destroy() method for cleanup
    @Override
    public void destroy() {
        System.out.println("Servlet is being destroyed.");
    }

    // Needed because GenericServlet implements ServletConfig
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "DemoServlet for demonstrating javax.servlet components.";
    }
}
