<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<body>
<h1 th:inline="text">Witaj a panelu</h1>
<form th:action="@{/logout}" method="post">
    <input type="submit" value="Wyloguj"/>
</form>
</body>
</html>