
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>attribute页面</h2>
<%-- 如果要在jsp中写java代码，需要写在脚本段中 --%>
<%
    // 获取域对象
    String name = (String) request.getAttribute("name");
    System.out.println("name：" + name);
%>
</body>
</html>
