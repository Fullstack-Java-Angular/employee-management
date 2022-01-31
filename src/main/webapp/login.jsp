<%--
  Created by IntelliJ IDEA.
  User: rrr3d
  Date: 1/13/22
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login - Emoloyee Management App</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<div class=" d-flex  align-items-center justify-content-center mt-5">
    <form class="text-center border border-light p-5" method="post" action="">
        <p class="h4 mb-4">Login</p>

        <p>Welcome Back, simply dummy text of the printing</p>

<%--        <div class="alert alert-danger" role="alert">--%>
<%--            This is a danger alert—check it out!--%>
<%--        </div>--%>

        <!-- Name -->
        <input type="text" name="email" id="defaultSubscriptionFormPassword" class="form-control mb-4" placeholder="E-mail">

        <!-- Email -->
        <input type="password" name="password" id="defaultSubscriptionFormEmail" class="form-control mb-4" placeholder="Password">

        <!-- Sign in button -->
        <button style="background: #435d7d" class="btn btn-info btn-block" type="submit">Login</button>
    </form>
</div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
