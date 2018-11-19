<%--
  Created by IntelliJ IDEA.
  User: 986537
  Date: 11/9/2018
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="/login">
    <label>Username :</label>
    <input type="text" name="name" value="${cookie['name'].value}">
    <label>Password :</label>
    <input type="password" name="password">
    <input type="checkbox" name="chk"
    <c:if test="${cookie['name']!=null}"> checked </c:if>
    >
    <label>remember me</label>
    <input type="submit" value="Login">
      <p>${error}</p>
</form>
</body>
</html>
