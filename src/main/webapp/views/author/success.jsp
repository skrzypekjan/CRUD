<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<h1>AUTHOR ADDED CORRECTLY</h1>
<table>
    <tr>
        <td>FirstName:</td>
        <td>${author.firstName}</td>
    </tr>
    <tr>
        <td>LastName:</td>
        <td>${author.lastName}</td>
    </tr>
</table>
<form action="/author/add">
    <input type="submit" value="BACK" />
</form>
<form action="/">
    <input type="submit" value="HOME" />
</form>
</body>
</html>