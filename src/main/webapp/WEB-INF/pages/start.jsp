<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style>
    <%@include file='../css/forms.css' %>
</style>
<body>
<section class="container">
    <div class="login">

        <h1>Login to Web App</h1>
        <a href="<c:url value="/selectJiga" />">Жигуль</a> <br>
        <a href="<c:url value="/selectBentley" />">Ведро</a><br>

    </div>
</section>

</body>
</html>