package ddist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        out.println("<!DOCTYPE html");
        out.println("PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"");
        out.println("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
        out.println("<head>");
        out.println("<title>Standalone servlet page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Standalone servlet page</h1>");
        out.println("<p>Hello from standalone servlet page!</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
