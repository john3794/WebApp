<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>

<%--
  Created by IntelliJ IDEA.
  User: jonb
  Date: 07/03/17
  Time: 11.33
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Hello World!!!!!</h1>
  <%
    Date date = new Date();
    out.print( "<h2>" +date.toString()+"</h2>");
  %>

  </body>
</html>
