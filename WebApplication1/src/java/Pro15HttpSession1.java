
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/session1")
public class Pro15HttpSession1 extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.print("Welcome " + n);

            HttpSession session = request.getSession();
            session.setAttribute("uname", n);

            out.print("<a href='session2 '>visit</a>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
