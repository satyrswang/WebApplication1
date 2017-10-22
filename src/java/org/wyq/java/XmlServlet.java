/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wyq.java;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;



/**
 *
 * @author wyq
 */
public class XmlServlet extends HttpServlet{
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //response.getWriter().println("xmlservlet");
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        // out.println("hello,user");
         String userName = request.getParameter("userName");
         out.println("Hello!  "+userName);
         HttpSession hs = request.getSession();
         ServletContext context = request.getServletContext();
         if (userName != null && !userName.isEmpty()) {
            hs.setAttribute("saveuserName", userName);
            context.setAttribute("saveuserName", userName);
         }
         out.println("  session saveuserName   "+(String)hs.getAttribute("saveuserName"));
         out.println("  context saveusername   "+ (String)context.getAttribute("saveuserName"));
         
     }
     
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
        // out.println("hello,user");
         String userName = request.getParameter("userName");
         String fullName = request.getParameter("fullName");
         String prof = request.getParameter("prof");
         String[] loca = request.getParameterValues("loc");
      
         out.println("Hello!  "+userName+"  "+ fullName +"  you are a  "+ prof +"  you are  "+loca.length);
         for (String loca1 : loca) {
             out.println(loca1+" , ");
         }
    }

      
       
}
