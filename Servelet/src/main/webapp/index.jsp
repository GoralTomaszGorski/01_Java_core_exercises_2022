<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>

<H1 ALIGN="CENTER">Przyklad HTTP POST</H1>

<FORM ACTION="http://localhost:8081/Servelet_war_exploded/Parameters/wypisz_parametry"
      METHOD="POST">
    Parametr 1:
    <INPUT TYPE="TEXT" NAME="parametr1"><BR>
    Parametr 2:
    <INPUT TYPE="TEXT" NAME="parametr2"><BR>
    Parametr 3:
    <INPUT TYPE="TEXT" NAME="parametr3"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Wyslij">
</FORM>

<body>
<h1>
    <%= "Tu wisne jest coś ciekawego jsp HTML" %>
</h1>

<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="helloservlet">Hello Servlet</a>
</body>
</html>