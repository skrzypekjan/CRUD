<jsp:include page="header.jsp" />

<h1>Welcome to my article page</h1>
<br>
<h3>Add Author</h3>
<form action="/author/add">
    <input type="submit" value="ADD" />
</form>
<h3>Add Category</h3>
<form action="/category/add">
    <input type="submit" value="ADD" />
</form>
<h3>Add Article</h3>
<form action="/article/add">
    <input type="submit" value="ADD" />
</form>
<h3>Check the last five records</h3>
<form action="/home/add">
    <input type="submit" value="CHECK" />
</form>
<jsp:include page="footer.jsp" />
