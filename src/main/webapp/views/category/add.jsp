<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add category</h1>

<form:form method="post" modelAttribute="category">
    <div>
        <p>Opis</p>
        <form:input path="description"/>
        <form:errors path="description"/>
    </div>
    <div>
        <p>Nazwa</p>
        <form:input path="name"/>
        <form:errors path="name"/>
    </div>
    <input type="submit" value="Save">
</form:form>
<form action="/">
    <input type="submit" value="Wróć"/>
</form>
</body>
</html>