<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter View From Form</title>
</head>
<body>

<h1>Имя, полученное из формы:<%=request.getParameter("name")%></h1>
<h1>Фамилия, полученная из формы:<%=request.getParameter("surname")%></h1>

</body>
</html>
