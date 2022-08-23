
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value = "/url1")
public class Pro14Url extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.print("Welcome " + n);

            //appending the username in the query string  
            out.print("<a href='url2?uname=   " + n + "'><h1> visit</h1></a>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
