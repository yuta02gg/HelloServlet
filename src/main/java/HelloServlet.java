import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
  public HelloServlet() {
    super();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
  ServletException, IOException {
	PrintWriter out = response.getWriter();
    out.println("<HTML>");
    out.println("<BODY>");
    out.println("<H3>Hello Servlet!</H3>");
    out.println("</BODY>");
    out.println("</HTML>");
  }

}
