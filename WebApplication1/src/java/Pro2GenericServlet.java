/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

//
//@WebServlet(value = "/Genric") 
public class Pro2GenericServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello generic servlet</b>");
        out.print("</body></html>");

    }
}
