
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Pro12Cookies1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.print("Welcome " + n);

            Cookie ck = new Cookie("uname", n);//creating cookie object  
            response.addCookie(ck);//adding cookie in the response  
            out.print("<form action='cookies2' method=\"post\"> ");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");

            out.close();

        } catch (Exception e) {
            System.err.println("error" + e);
        }
    }
}
