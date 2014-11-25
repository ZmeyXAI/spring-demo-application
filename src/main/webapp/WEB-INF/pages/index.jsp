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

    <form:form  method="post" action="/add" modelAttribute="user">
                <label for="fistNameInput">Fist name: </label>
                <form:input path="fistName" id="fistNameInput"/>
                <form:errors path="fistName" cssClass="error"/>
                <br/>
        
                <label for="lastNameInput">Last name: </label>
                <form:input path="lastName" id="lastNameInput"/>
                <form:errors path="lastName" cssClass="error"/>
                <br/>
        
                <label for="patronymicInput">Patronymic: </label>
                <form:input path="patronymic" id="patronymicInput"/>
                <form:errors path="patronymic" cssClass="error"/>
                <br/>
        
                <label for="dateInput">Date of birth: </label>
                <form:input path="date" id="dateInput" placeholder="MM/DD/YYYY"/>
                <form:errors path="date" cssClass="error"/>
                <br/>
        
                <label for="eMailInput">eMail: </label>
                <form:input path="eMail" id="eMailInput"/>
                <form:errors path="eMail" cssClass="error"/>
                <br/>
                
             

        <br/>
        <input type="submit" name="Next" value="submit"/>
        <input type="reset" name="Reset" value="Reset"/>
        
    </form:form>

</div>

</body>
</html>
