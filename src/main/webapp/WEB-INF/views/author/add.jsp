<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />

<h1>Add author</h1>

<form:form method="post" modelAttribute="author">

    <div>
        <p>Name: </p>
        <form:input path="firstName"/>
        <form:errors path="firstName"/>
    </div>
    <div>
        <p>Last name: </p>
        <form:input path="lastName"/>
        <form:errors path="lastName"/>
    </div>
    <br>
    <input type="submit" value="SAVE">
</form:form>
<br>
<form action="/">
    <input type="submit" value="BACK" />
</form>
<jsp:include page="../footer.jsp" />