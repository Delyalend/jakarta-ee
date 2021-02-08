<%@ page import="com.example.demo1._2_jsp.classForUsingInJsp.Calculator" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<jsp:include page="jsp/Header.jsp"/>
<h1>Hello, User!</h1>
<h3>This is home page of out web site!</h3>
<p>Time now: <%=new java.util.Date()%></p>
<p>2+2=<%=new Calculator().sum(2,3)%></p>
<jsp:include page="jsp/Footer.jsp"/>

<form method="post" action="jsp/ParameterViewFromForm.jsp">
    <p>Имя:</p><input type="text" name="name"><div></div>
    <p>Фамилия:</p><input type="text" name="surname"><div></div>
    <p>Отправить</p><input type="submit"><div></div>
    <p>Данные будут отображены на url /parameterViewFromForm</p>
</form>

</body>
</html>
