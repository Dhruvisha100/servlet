
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/session2")
public class Pro15HttpSession2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try{  
  
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String n = (String) session.getAttribute("uname");
        out.print("Hello " + n);

        out.close();

    }
    catch(Exception e

    
        ){System.out.println(e);
    }
}
}
