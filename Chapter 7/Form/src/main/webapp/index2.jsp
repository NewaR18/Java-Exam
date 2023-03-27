<%--
  Created by IntelliJ IDEA.
  User: sudip
  Date: 3/27/2023
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for(int i=0;i<10;i++){


%>
<p>Id: </p><%= request.getParameter("n1")%>
<p>Name: </p><%= request.getParameter("n2")%>
<p>Age: </p><%= request.getParameter("n3")%>
<%
    }
    %>
</body>
</html>
