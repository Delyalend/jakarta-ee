<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter view</title>
</head>
<body>
<p>Имя: <%=request.getParameter("name")%></p>
<p>Фамилия: <%=request.getParameter("surname")%></p>
</body>
</html>
