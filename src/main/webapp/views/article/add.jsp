<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add article</h1>

<form:form method="post" modelAttribute="article">
    <div>
        <p>Title :</p>
        <form:input path="title"/>
        <form:errors path="title"/>
    </div>
    <div>
        <p>author :</p>
        <form:select path="author.id"
                     items="${author}" itemLabel="lastName" itemValue="id"/>
        <form:errors path="author"/>
    </div>
    <div>
        <p>category :</p>
        <form:select path="category.id"
                     items="${category}" itemLabel="name" itemValue="id"/>
        <form:errors path="category"/>
    </div>
    <div>
        <p>content :</p>
        <form:input path="content"/>
        <form:errors path="content"/>
    </div>
    <div>
        <p>created :</p>
        <form:input path="created"/>
        <form:errors path="created"/>
    </div>

    <input type="submit" value="SAVE">
</form:form>
<form action="/">
    <input type="submit" value="BACK" />
</form>
</body>
</html>