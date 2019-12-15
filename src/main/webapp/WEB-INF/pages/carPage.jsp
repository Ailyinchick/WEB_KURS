<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
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

    <input type="submit" value="Выбрать конфигурацию">

</form>

</body>
</html>