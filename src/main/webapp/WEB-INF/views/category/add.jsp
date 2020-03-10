<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<h1>ADD CATEGORY</h1>

<form:form method="post" modelAttribute="category">
    <div>
        <p>Description:</p>
        <form:input path="description"/>
        <form:errors path="description"/>
    </div>
    <div>
        <p>Name:</p>
        <form:input path="name"/>
        <form:errors path="name"/>
    </div>
    <br>
    <input type="submit" value="SAVE" class="btn btn-light btn-icon-split">
</form:form>
<br>
<form action="/">
    <input type="submit" value="BACK"/>
</form>
<jsp:include page="../footer.jsp" />