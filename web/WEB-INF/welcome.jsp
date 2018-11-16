<%--
  Created by IntelliJ IDEA.
  User: 986537
  Date: 11/15/2018
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome <c:out value='${sessionScope["user"].username}'/><br/>
</h1>
<form action="/logout">
    <input type="submit" value="logout">
</form>
</body>
</html>
