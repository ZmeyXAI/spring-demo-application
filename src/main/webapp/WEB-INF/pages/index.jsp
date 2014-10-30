<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
    <style>
        body {
            background-color: #eee;
            font: helvetica;
        }

        #container {
            width: 500px;
            background-color: #fff;
            margin: 30px auto;
            padding: 30px;
            border-radius: 5px;
        }

        .green {
            font-weight: bold;
            color: green;
        }

        .message {
            margin-bottom: 10px;
        }

        label {
            width: 70px;
            display: inline-block;
        }

        input {
            display: inline-block;
            margin-right: 10px;
        }

        form {
            line-height: 160%;
        }

        .hide {
            display: none;
        }

        .error {
            color: red;
            font-size: 0.9em;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div id="container">

    <c:if test="${not empty message}">
        <div class="message green">${message}</div>
    </c:if>

    <form:form action="/second" modelAttribute="user">
        <label for="loginInput">Login: </label>
        <form:input path="login" id="loginInput"/>
        <form:errors path="login" cssClass="error"/>
        <br/>


        <label for="passwordInput">Password: </label>
        <form:password path="password" id="passwordInput"/>
        <form:errors path="password" cssClass="error"/>
        <br/>

        <br/>
        <input type="submit" name="Login" value="Login"/>
        <input type="reset" name="Reset" value="Reset"/>
        <input type="submit" name="Registration" value="Registration"/>
    </form:form>

</div>

</body>
</html>
