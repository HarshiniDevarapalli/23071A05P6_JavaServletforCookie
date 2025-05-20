package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DisplayCookiesServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       Cookie[] cookies = req.getCookies();
       out.println("<h2>Cookie Details</h2>");
       out.println("<table border='1'><tr><th>Name</th><th>Value</th></tr>");
       if (cookies != null) {
           for (Cookie c : cookies) {
               String key = c.getName();
               if (key.equals("name") || key.equals("pass") || key.equals("branch") || key.equals("mail")) {
                   out.println("<tr><td>" + key + "</td><td>" + c.getValue() + "</td></tr>");
               }
           }
       } else {
           out.println("<tr><td colspan='2'>No cookies found</td></tr>");
       }
       out.println("</table>");
   }
}
