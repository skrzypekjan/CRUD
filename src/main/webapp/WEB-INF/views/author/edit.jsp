<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<p>Edit Yours Author</p>
<form:form method="post" action="/author/edit" modelAttribute="author">
    Name: <form:input path="firstName" />
    <form:errors path="firstName"/>
    Surname: <form:input path="lastName" />
    <form:errors path="lastName"/>
    <form:hidden path="id"/>
    <br>
    <input type="submit" value="Edit!">
</form:form>
<jsp:include page="../footer.jsp" />
