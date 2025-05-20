package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet {
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
       String user = req.getParameter("username");
       String pass = req.getParameter("password");
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       if ("admin".equals(user) && "password1234".equals(pass)) {
           
           out.println("<html><body>");
           out.println("<h2>Welcome " + user + "!</h2>");
           out.println("<form method='post' action='createCookies'>");
           out.println("Name: <input type='text' name='name'><br><br>");
           out.println("Pass: <input type='text' name='pass'><br><br>");
           out.println("Branch: <input type='text' name='branch'><br><br>");
           out.println("Mail: <input type='email' name='mail'><br><br>");
           out.println("<input type='submit' value='Create Cookies'>");
           out.println("</form>");
           out.println("</body></html>");
       } else {
           out.println("<h3 style='color:red;'>Incorrect credentials</h3>");
           out.println("<a href='login.html'>Try Again</a>");
       }
   }
}
