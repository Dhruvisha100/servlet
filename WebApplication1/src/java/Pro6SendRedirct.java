
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Pro6SendRedirct extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {        
        res.setContentType("text/html");        
        PrintWriter pw = res.getWriter();        
        
        res.sendRedirect("https://www.javatpoint.com/servlet-tutorial");
    }
}
