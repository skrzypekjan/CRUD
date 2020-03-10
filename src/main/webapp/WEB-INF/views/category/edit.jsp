<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<p>Edit Yours Category</p>
<form:form method="post" action="/category/edit" modelAttribute="category">
    <p>Name: </p>
    <form:input path="name" />
    <form:errors path="name"/>
    <p>Description: </p>
    <form:input path="description" />
    <form:errors path="description"/>
    <form:hidden path="id"/>
    <input type="submit" value="Edit!">
</form:form>
<jsp:include page="../footer.jsp" />
