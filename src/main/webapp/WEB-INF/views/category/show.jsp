<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp" />

<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Categories</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                <tr>
                    <th>NAME</th>
                    <th>DESCRIPTION</th>
                    <th>EDITION</th>
                    <th>DELETE</th>
                </tr>
                </thead>
                <tfoot>
                    <th>NAME</th>
                    <th>DESCRIPTION</th>
                    <th>EDITION</th>
                    <th>DELETE</th>
                </tfoot>
                <tbody>
                <c:forEach items="${category}" var="cat">
                    <tr>
                        <th>${cat.name}</th>
                        <th>${cat.description}</th>
                        <%--<th>--%>
                            <%--<a href="/consultations/edit/${category.id}" class="btn btn-warning btn-icon-split">--%>
                                <%--<span class="icon text-white-50">--%>
                                    <%--<i class="fas fa-exclamation-triangle"></i>--%>
                                <%--</span>--%>
                                <%--<span class="text">Edytuj</span>--%>
                            <%--</a>--%>
                        <%--</th>--%>
                        <%--<th>--%>
                            <%--<a href="/consultations/remove/${category.id}" class="btn btn-danger btn-icon-split">--%>
                                <%--<span class="icon text-white-50">--%>
                                    <%--<i class="fas fa-trash"></i>--%>
                                <%--</span>--%>
                                <%--<span class="text">Usuń</span>--%>
                            <%--</a>--%>
                        <%--</th>--%>
                    </tr>
                </c:forEach>
                </tbody>
                <a href="/category/add" class="btn btn-secondary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-arrow-right"></i>
                    </span>
                    <span class="text">BACK</span>
                </a>
                <a href="/" class="btn btn-secondary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-arrow-right"></i>
                    </span>
                    <span class="text">HOME</span>
                </a>
<jsp:include page="../footer.jsp" />