<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<h1>CATEGORIES ADDED CORRECTLY</h1>
<table>
    <tr>
        <td>Descryption:</td>
        <td>${category.description}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${category.name}</td>
    </tr>
</table>
<form action="/category/add">
    <input type="submit" value="BACK" />
</form>
<form action="/">
    <input type="submit" value="HOME" />
</form>
</body>
</html>