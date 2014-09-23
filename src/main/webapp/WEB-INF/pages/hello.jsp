<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
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

    <form:form action="valid" modelAttribute="user">
        <label for="nameInput">Name: </label>
        <form:input path="name" id="nameInput"/>
        <form:errors path="name" cssClass="error"/>
        <br/>

        <label for="ageDateInput">ageDate: </label>
        <form:input path="ageDate" id="ageDateInput"/>
        <form:errors path="ageDate" cssClass="error"/>
        <br/>
        <br/>
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
