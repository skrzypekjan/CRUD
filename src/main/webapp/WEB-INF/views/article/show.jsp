<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />

<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Article</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                <tr>
                    <th>TITLE</th>
                    <th>CONTENT</th>
                    <th>CREATED</th>
                    <th>UPDATED</th>
                    <th>AUTHOR</th>
                    <th>CATEGORY</th>
                    <th>EDITION</th>
                    <th>DELETE</th>
                </tr>
                </thead>
                <tfoot>
                    <th>TITLE</th>
                    <th>CONTENT</th>
                    <th>CREATED</th>
                    <th>UPDATED</th>
                    <th>AUTHOR</th>
                    <th>CATEGORY</th>
                    <th>EDITION</th>
                    <th>DELETE</th>
                </tfoot>
                <tbody>
                <c:forEach items="${article}" var="article">
                    <tr>
                        <th>${article.title}</th>
                        <th>${article.content}</th>
                        <th>${article.created}</th>
                        <th>${article.updated}</th>
                        <th>${article.category.name}</th>
                        <th>${article.author.lastName}</th>
                        <th>
                            <a href="/article/edit/${article.id}" class="btn btn-warning btn-icon-split">
                                <span class="icon text-white-50">
                                    <i class="fas fa-exclamation-triangle"></i>
                                </span>
                                <span class="text">Edit</span>
                            </a>
                        </th>
                        <th>
                            <a href="/article/remove/${article.id}" class="btn btn-danger btn-icon-split">
                                <span class="icon text-white-50">
                                    <i class="fas fa-trash"></i>
                                </span>
                                <span class="text">Delete</span>
                            </a>
                        </th>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <a href="/article/add" class="btn btn-secondary btn-icon-split">
        <span class="icon text-white-50">
            <i class="fas fa-arrow-right"></i>
        </span>
            <span class="text">ADD</span>
        </a>
        <a href="/" class="btn btn-secondary btn-icon-split">
        <span class="icon text-white-50">
            <i class="fas fa-arrow-right"></i>
        </span>
            <span class="text">HOME</span>
        </a>
    </div>
</div>
<jsp:include page="../footer.jsp" />