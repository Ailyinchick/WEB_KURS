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
</style>
<body>

<section class="container">
    <div class="login">

        <table border="2">
            <tr>
                <th>ID</th>
                <th>Заказчик</th>
                <th>Авто</th>
                <th>Дата</th>
            </tr>
            <c:forEach items="${statistic}" var="item">
                <tr>
                    <td> ${item.id} чего</td>
                    <td> ${item.owner} </td>
                    <td> ${item.car} </td>
                    <td> ${item.date} </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</section>

</body>
</html>
