<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />
<h1>Add author</h1>

<p>Last five records :</p>
<table>
    <tr>
        <th>ID</th>
        <th>TITLE</th>
        <th>CONTENT</th>
    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <th>${article.id}</th>
            <th>${article.title}</th>
            <th>${article.content}</th>
        </tr>
    </c:forEach>
</table>
<br>
<form action="/">
    <input type="submit" value="BACK" />
</form>
<%--<form:form method="post" modelAttribute="articles">--%>
<%--<div>--%>
<%--<p>Ostatnie 5 artykułów :</p>--%>
<%--<form:select path="articles.id"--%>
<%--items="${list}" itemLabel="title" itemValue="id"/>--%>
<%--<form:errors path="articles"/>--%>
<%--</div>--%>
<%--<input type="submit" value="Save">--%>
<%--</form:form>--%>
<jsp:include page="../footer.jsp" />