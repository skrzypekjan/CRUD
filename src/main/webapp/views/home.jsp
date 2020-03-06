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
    <title>ARTICLES</title>
</head>
<body>
<h1>Welcome to my article page</h1>
<br>
<h3>Add Author</h3>
<form action="/author/add">
    <input type="submit" value="ADD" />
</form>
<h3>Add Category</h3>
<form action="/category/add">
    <input type="submit" value="ADD" />
</form>
<h3>Add Article</h3>
<form action="/article/add">
    <input type="submit" value="ADD" />
</form>
<h3>Check the last five records</h3>
<form action="/home/add">
    <input type="submit" value="CHECK" />
</form>
</body>
</html>
