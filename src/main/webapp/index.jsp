<%--@elvariable id="textA" type="servlets"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>My first site JSP </title>
</head>
<body>
    ${textA}
    <br>
    <%=request.getAttribute("textB") %>
    <br>
    <%= "Мое текущее время "+(new java.util.Date() ).toLocaleString() %>
</body>
</html>
