<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style>
    <%@include file='../css/css.css' %>
    <%@include file='../css/forms.css' %>
</style>
<body>


<section class="column">


    <form action="resultPage" method="get" class="login">

        <div class="login h1"> А ты платишь налоги?</div>
        <br>
        <div>
            <img src="resources/images/somepic.jpg" alt="picture">
        </div>
        <input type="radio" name="answer" value="Option 1" class="left-container"> Да <br>
        <input type="radio" name="answer" value="Option 2" class="red"> Да <br>
        <input type="radio" name="answer" value="Option 3"> Да <br>
        <input type="radio" name="answer" value="Option 4"> Да <br>
        <br>
        <input type="submit" value="Следующий" class="button cyan">
    </form>

</section>

</body>
</html>