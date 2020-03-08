<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADDING</title>
</head>
<body>
<h1>ADD CATEGORY</h1>

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
    <input type="submit" value="SAVE">
</form:form>
<form action="/">
    <input type="submit" value="BACK"/>
</form>
</body>
</html>