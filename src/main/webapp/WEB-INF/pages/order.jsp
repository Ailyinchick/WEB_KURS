<%--
  Created by IntelliJ IDEA.
  User: ailyi
  Date: 15.12.2019
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<style>
    <%@include file='../css/forms.css' %>
</style>
<body>

<section class="container">
    <div class="login">
        <form action="takeOrder">

            <div class="container">
                ${config}
            </div>

            <br>
            <input type="submit" value="Order">

        </form>
    </div>
</section>


</body>
</html>
