<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dodany student</h1>
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
</body>
<form action="/home/add">
    <input type="submit" value="BACK" />
</form>
<form action="/">
    <input type="submit" value="HOME" />
</form>
</html>