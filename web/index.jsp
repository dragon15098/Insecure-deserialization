<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/web_war_exploded/encode" method="post"><br>
    <label>User name</label> <br>
    <input name="username" type="text"/> <br>

    <label>Email</label> <br>
    <input name="email" type="text"/> <br>

    <label>Year of birth</label> <br>
    <input name="year" type="text"/> <br>

    <label>Sex</label> <br>
    <input name="sex" type="text"/> <br>

    <input type="submit">
</form>

<form action="/web_war_exploded/decode" method="post"><br>
    <label>Object encoded</label> <br>
    <input name="obj" type="text"/> <br>

    <input type="submit">
</form>
</body>
</html>
