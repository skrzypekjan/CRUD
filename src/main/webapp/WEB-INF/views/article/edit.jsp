<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<p>Edit Yours Article</p>
<form:form method="post" action="/article/edit" modelAttribute="article">
    <div>
        <p>Title :</p>
        <form:input path="title"/>
        <form:errors path="title"/>
    </div>
    <div>
        <p>Author :</p>
        <form:select path="author.id"
                     items="${author}" itemLabel="lastName" itemValue="id"/>
        <form:errors path="author"/>
    </div>
    <div>
        <p>Category :</p>
        <form:select path="category.id"
                     items="${category}" itemLabel="name" itemValue="id"/>
        <form:errors path="category"/>
    </div>
    <div>
        <p>Content :</p>
        <form:input path="content"/>
        <form:errors path="content"/>
    </div>
    <div>
        <p>Created :</p>
        <form:input path="created"/>
        <form:errors path="created"/>
    </div>
    <div>
        <p>Updated :</p>
        <form:input path="updated"/>
        <form:errors path="updated"/>
    </div>
    <br>
    <input type="submit" value="Edit!">
</form:form>
<jsp:include page="../footer.jsp" />
