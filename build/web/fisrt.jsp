<%-- 
    Document   : fisrt
    Created on : Oct 22, 2017, 9:45:30 AM
    Author     : wyq
--%>

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="simpleForm.html"  %>

<!DOCTYPE html>

<html>
    <jsp:text><![CDATA[<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"DTD/xhtml1-strict.dtd">]]>
</jsp:text>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       <%! int day = 3; %> 
       <%! int fontSize; %> 
        
        <% if (day == 1 | day == 7) { %>
        <p>今天是周末</p>
<% } else { %>
        <p>今天不是周末</p>
<% } %>
        
        The time is <%= new Date()%>
        
        </br>
        <%!
             public int add(int x ,int y){
                return x+y;
            } 
        %>
        <%while ( fontSize <= 3){ %>
        <font color="green" size="<%= fontSize %>">
            jsp
        </font><br />
            <%fontSize++;%>
        <%}%>
        
        <%
            int i =1;
            int j= 4;
            int k = i+j;
            int k2= add(i,j);
        %>
           
        The value is <%= k2 %>   <%= k %>
        <%
            for(int m=0;m<5;m++){
        %>
                <br> i = <%= i %>
            
        <%}%>
        
        
        <h2>Jsp 使用 JavaBean 实例</h2>
<jsp:useBean id="test" class="org.wyq.java.testBean" />
 
<jsp:setProperty name="test"  property="message"  value="hiwyq..." />
 
<p>输出信息....</p>
 
<jsp:getProperty name="test" property="message" />

        <jsp:element name="xmlElement">
<jsp:attribute name="xmlElementAttr">
   属性值
</jsp:attribute>
<jsp:body>
    <br>
   XML 元素的主体
   <br>
</jsp:body>
</jsp:element>
   
   <books><book><jsp:text> 
                
    Welcome to JSP Programming
</jsp:text></book></books>
    
    
    <h2>HTTP 头部请求实例</h2>
<table width="100%" border="1" align="center">
<tr bgcolor="#949494">
<th>Header Name</th><th>Header Value(s)</th>
</tr>
<%
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
   
%>
</table>


<h2>自动刷新实例</h2>
<%
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
%>
    
    </body>
</html>
