<html>
<body>
<%--<h1>Custom login page</h1>--%>
<%--<form th:action="@{/login}" method="post">--%>
    <%--<div><label> User Name : <input type="text" name="username"/> </label></div>--%>
    <%--<div><label> Password: <input type="password" name="password"/> </label></div>--%>
    <%--<div><input type="submit" value="Sign In"/></div>--%>


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
    body{
        background-color:#5286F3;
        font-size:14px;
        color:#fff;
    }
    .simple-login-container{
        width:300px;
        max-width:100%;
        margin:50px auto;
    }
    .simple-login-container h2{
        text-align:center;
        font-size:20px;
    }

    .simple-login-container .btn-login{
        background-color:#FF5964;
        color:#fff;
    }
    a{
        color:#fff;
    }
</style>

<div class="simple-login-container">
    <h2>Login Form</h2>
    <div class="row">
        <div class="col-md-12 form-group">
            <input type="text" class="form-control" placeholder="Username" name="username">
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 form-group">
            <input type="password" placeholder="Enter your Password" class="form-control" name="password">
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 form-group">
            <input type="submit" class="btn btn-block btn-login" placeholder="Enter your Password" value="Sign In">
        </div>
    </div>
</div>
</body>
</html>