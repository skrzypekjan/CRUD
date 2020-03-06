<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Catergories</h1>
<table>
    <tr>
        <td>Descryption:</td>
        <td>${article.title}</td>
    </tr>
    <tr>
        <td>author:</td>
        <td>${article.author.lastName}</td>
    </tr>
    <tr>
        <td>category:</td>
        <td>${article.category.name}</td>
    </tr>
    <tr>
        <td>content:</td>
        <td>${article.content}</td>
    </tr>
    <tr>
        <td>created:</td>
        <td>${article.created}</td>
    </tr>
</table>
<form action="/article/add">
    <input type="submit" value="WRÓC DO DODAWNIA" />
</form>
</body>
</html>