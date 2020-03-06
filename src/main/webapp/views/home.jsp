<%--
  Created by IntelliJ IDEA.
  User: jan
  Date: 07.02.19
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Witaj na mojej stronie z artykułami</h1>
<br>
<h3>Dodaj Autora</h3>
<form action="/author/add">
    <input type="submit" value="Dodaj Autora" />
</form>
<h3>Dodaj Kategorie</h3>
<form action="/category/add">
    <input type="submit" value="Dodaj Kategorię" />
</form>
<h3>Dodaj Artykuł</h3>
<form action="/article/add">
    <input type="submit" value="Dodaj Artykuł" />
</form>
<h3>Sprawdź ostatnie </h3>
<form action="/home/add">
    <input type="submit" value="Sprawdź" />
</form>
</body>
</html>
