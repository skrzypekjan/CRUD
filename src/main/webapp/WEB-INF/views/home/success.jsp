<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<h1>Dodany student</h1>
<table>
    <tr>
        <td>FirstName:</td>
        <td>${author.firstName}</td>
    </tr>
    <tr>
        <td>LastName:</td>
        <td>${author.lastName}</td>
    </tr>
</table>
<br>

<form action="/home/add">
    <input type="submit" value="BACK" />
</form>
<br>
<form action="/">
    <input type="submit" value="HOME" />
<jsp:include page="../footer.jsp" />