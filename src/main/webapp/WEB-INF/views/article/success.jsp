<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<h1>ARTICLE ADDED CORRECTLY</h1>
<table>
    <tr>
        <td>Descryption:</td>
        <td>${article.title}</td>
    </tr>
    <tr>
        <td>author:</td>
        <td>${article.author.lastName}</td>
    </tr>
    <tr>
        <td>category:</td>
        <td>${article.category.name}</td>
    </tr>
    <tr>
        <td>content:</td>
        <td>${article.content}</td>
    </tr>
    <tr>
        <td>created:</td>
        <td>${article.created}</td>
    </tr>
</table>
<br>
<form action="/article/add">
    <input type="submit" value="BACK" />
</form>
<br>
<form action="/">
    <input type="submit" value="HOME" />
</form>
<jsp:include page="../footer.jsp" />