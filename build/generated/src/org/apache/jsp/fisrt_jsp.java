package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Date;

public final class fisrt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int day = 3; 
 int fontSize; 

             public int add(int x ,int y){
                return x+y;
            } 
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/simpleForm.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"XmlServlet\">\n");
      out.write("            User Name:<input name = \"userName\"/>\n");
      out.write("            Full Name:<input name = \"fullName\"/>\n");
      out.write("            <br>\n");
      out.write("            Profession:\n");
      out.write("            <input type=\"radio\" name=\"prof\" value=\"Developer\">Developer</input>\n");
      out.write("            <input type=\"radio\" name=\"prof\" value=\"Architect\">Architect</input>\n");
      out.write("            <select name=\"loc\" multiple size=\"2\">\n");
      out.write("                <option value=\"here\">here</option>\n");
      out.write("                <option value=\"there\">there</option>\n");
      out.write("                <option value=\"far\">far</option>\n");
      out.write("                <option value=\"near\">near</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\"/>\n");
      out.write("        </form>\n");
      out.write("        <!--\n");
      out.write("        ç¹å»submitåå°è¾å¥ä½ä¸ºuserNameåæ°ä¼ å¥XmlServletåºådoGet\n");
      out.write("        -->\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <!DOCTYPE html\n");
      out.write("PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n");
      out.write("\"DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("       ");
      out.write(" \n");
      out.write("       ");
      out.write(" \n");
      out.write("        \n");
      out.write("        ");
 if (day == 1 | day == 7) { 
      out.write("\n");
      out.write("        <p>今天是周末</p>\n");
 } else { 
      out.write("\n");
      out.write("        <p>今天不是周末</p>\n");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        The time is ");
      out.print( new Date());
      out.write("\n");
      out.write("        \n");
      out.write("        </br>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
while ( fontSize <= 3){ 
      out.write("\n");
      out.write("        <font color=\"green\" size=\"");
      out.print( fontSize );
      out.write("\">\n");
      out.write("            jsp\n");
      out.write("        </font><br />\n");
      out.write("            ");
fontSize++;
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            int i =1;
            int j= 4;
            int k = i+j;
            int k2= add(i,j);
        
      out.write("\n");
      out.write("           \n");
      out.write("        The value is ");
      out.print( k2 );
      out.write("   ");
      out.print( k );
      out.write("\n");
      out.write("        ");

            for(int m=0;m<5;m++){
        
      out.write("\n");
      out.write("                <br> i = ");
      out.print( i );
      out.write("\n");
      out.write("            \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h2>Jsp 使用 JavaBean 实例</h2>\n");
      org.wyq.java.testBean test = null;
      synchronized (_jspx_page_context) {
        test = (org.wyq.java.testBean) _jspx_page_context.getAttribute("test", PageContext.PAGE_SCOPE);
        if (test == null){
          test = new org.wyq.java.testBean();
          _jspx_page_context.setAttribute("test", test, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write(" \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("test"), "message", "hiwyq...", null, null, false);
      out.write("\n");
      out.write(" \n");
      out.write("<p>输出信息....</p>\n");
      out.write(" \n");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.wyq.java.testBean)_jspx_page_context.findAttribute("test")).getMessage())));
      out.write("\n");
      out.write("\n");
      out.write("        ");
      String _jspx_temp0 = "属性值";
      out.write("<" + "xmlElement" + " xmlElementAttr=\"" + _jspx_temp0 + "\"" + ">");
      out.write("\n");
      out.write("    <br>\n");
      out.write("   XML 元素的主体\n");
      out.write("   <br>\n");
      out.write("</" + "xmlElement" + ">");
      out.write("\n");
      out.write("   \n");
      out.write("   <books><book> \n");
      out.write("                \n");
      out.write("    Welcome to JSP Programming\n");
      out.write("</book></books>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h2>HTTP 头部请求实例</h2>\n");
      out.write("<table width=\"100%\" border=\"1\" align=\"center\">\n");
      out.write("<tr bgcolor=\"#949494\">\n");
      out.write("<th>Header Name</th><th>Header Value(s)</th>\n");
      out.write("</tr>\n");

   Enumeration headerNames = request.getHeaderNames();
   Cookie[] cookie = request.getCookies();
   out.println(cookie.length);
   while(headerNames.hasMoreElements()) {
      String paramName = (String)headerNames.nextElement();
      out.print("<tr><td>" + paramName + "</td>\n");
      String paramValue = request.getHeader(paramName);
      out.println("<td> " + paramValue + "</td></tr>\n");
   }
   for(int co =0;co<cookie.length;co++){
       out.println("cookie   " + cookie[co]);
   }
   

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2>自动刷新实例</h2>\n");

   // 设置每隔5秒自动刷新
   response.setIntHeader("Refresh", 5);
   // 获取当前时间
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   int second = calendar.get(Calendar.SECOND);
   if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
   else
      am_pm = "PM";
   String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
   out.println("当前时间: " + CT + "\n"+"done");

      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
