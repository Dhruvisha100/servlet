
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(value = "/url2")
public class Pro14Url2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            //getting value from the query string  
            String n = request.getParameter("uname");
            out.print("Hello " + n);

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
