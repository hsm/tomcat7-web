package ddist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatchHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        Messages messages = new Messages();
        messages.setGreeting("Hello, World!");

        request.setAttribute("messages", messages);
        request.getRequestDispatcher("/WEB-INF/jsp/hello2.jsp").forward(request, response);
    }
}
