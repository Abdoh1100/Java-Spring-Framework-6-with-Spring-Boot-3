<%@page language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Result page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%--<h1>Result is : <%=session.getAttribute("result")%></h1>--%>
<h1>Result is :${result}</h1>
</body>
</html>