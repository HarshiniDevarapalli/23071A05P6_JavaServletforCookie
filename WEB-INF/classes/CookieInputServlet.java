package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class CookieInputServlet extends HttpServlet {
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
       String name = req.getParameter("name");
       String pass = req.getParameter("pass");
       String branch = req.getParameter("branch");
       String mail = req.getParameter("mail");
       Cookie c1 = new Cookie("name", name);
       Cookie c2 = new Cookie("pass", pass);
       Cookie c3 = new Cookie("branch", branch);
       Cookie c4 = new Cookie("mail", mail);
       c1.setMaxAge(3600);
       c2.setMaxAge(3600);
       c3.setMaxAge(3600);
       c4.setMaxAge(3600);
       res.addCookie(c1);
       res.addCookie(c2);
       res.addCookie(c3);
       res.addCookie(c4);
       res.sendRedirect("display");
   }
}
