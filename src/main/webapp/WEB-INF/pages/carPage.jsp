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
        <div> Сконфигурируйте автомобиль</div>

        <div name="carType" hidden>
            ${car}
        </div>
        <br>
        <form action="configCar">

            <select id="body" name="body">
                <option> Седан</option>
                <option> Купе</option>
            </select>
            <br>

            <select id="color" name="color">
                <option> Белый</option>
                <option> Чёрный</option>
                <option> Зелёный</option>
            </select>
            <br>

            <p class="submit"><input type="submit" name="commit" value="Выбрать конфигурацию"></p>

        </form>
    </div>
</section>

</body>
</html>