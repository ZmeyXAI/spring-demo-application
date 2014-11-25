<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>hello this is secondery pages</p>

<table border="1">
    <caption>Tables</caption>
    <tr>
        <th>fistName</th>
        <th>${user.fistName}</th>
    </tr>
    <tr>
        <th>lastName</th>
        <th>${user.lastName}</th>
    </tr>
    <tr>
        <th>patronymic</th>
        <th>${user.patronymic}</th>
    </tr>
    <tr>
        <th>Date of birth</th>
        <th>${user.Date}</th>
    </tr>
    <tr>
        <th>eMail</th>
        <th>${user.eMail}</th>
    </tr>

</table>


</body>
</html>
