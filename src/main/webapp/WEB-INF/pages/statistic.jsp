<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ailyi
  Date: 16.12.2019
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistic</title>
</head>
<style>
    <%@include file='../css/forms.css' %>
    <%@include file='../css/table.css' %>
</style>
<body>

<section class="container">
    <div class="login">

        <table border="2" class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Заказчик</th>
                <th>Авто</th>
                <th>Дата</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${statistic}" var="stat">
                <tr>
                    <td> ${stat.id} </td>
                    <td> ${stat.owner} </td>
                    <td> ${stat.car} </td>
                    <td> ${stat.date} </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>

</body>
</html>
