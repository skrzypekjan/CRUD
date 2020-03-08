<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>ADDING</title>
</head>
<body>
<h1>Add author</h1>

<form:form method="post" modelAttribute="author">
    <form:input path="firstName"/>
    <form:errors path="firstName"/>
    <form:input path="lastName"/>
    <form:errors path="lastName"/>

    <input type="submit" value="SAVE">
</form:form>
<form action="/">
    <input type="submit" value="BACK" />
</form>
</body>
</html>