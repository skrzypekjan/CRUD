<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add author</h1>

<form:form method="post" modelAttribute="author">
    <form:input path="firstName"/>
    <form:errors path="firstName"/>
    <form:input path="lastName"/>
    <form:errors path="lastName"/>

    <input type="submit" value="Save">
</form:form>
<form action="/">
    <input type="submit" value="Wróć" />
</form>
</body>
</html>