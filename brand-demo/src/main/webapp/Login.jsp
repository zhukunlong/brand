<%--
  Created by IntelliJ IDEA.
  User: BIG  B0SS
  Date: 2023/1/23
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="login.css" rel="stylesheet">
</head>
<body>
<div id="loginDiv"style="...">
    <form action="/brand-demo/loginServlet"  id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg}${register_msg}</div>
        <p>Username:<input id="username" name="username" value="${cookie.username.value}" type="text"></p>
        <p>Password:<input id="password" name="password" value="${cookie.password.value}" type="password"></p>
        <p>Remember:<input id="remember" name="remember" type="checkbox" value="1"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？点击注册</a>
        </div>
    </form>
</div>
</body>
</html>
