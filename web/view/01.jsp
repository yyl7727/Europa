<%--
  Created by IntelliJ IDEA.
  User: HNNC
  Date: 2020/05/04
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/Europa/user/save" method="POST">
        int:<input name="i"/> <br>
        <button type="submit">GO</button>
    </form>
    <form action="/Europa/user/f2" method="POST">
        id: <input type="text" name="id">
        username: <input type="text" name="username">
        password: <input type="text" name="password">
        birthday: <input type="text" name="birthday">
        <button type="submit">GO</button>
    </form>
</body>
</html>
