<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/3/27
  Time: 上午10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域对象</title>
</head>
<body>
<%
    // 获取session域对象
    String uname = (String) request.getSession().getAttribute("uname");
    String pwd = (String) request.getSession().getAttribute("pwd");

    // 获取request域对象
    String name = (String) request.getAttribute("name");
    out.println("session uname:"+uname);
    out.println("session pwd:"+ pwd);
    out.println("request name:"+ name);
%>
</body>
</html>
