<%--
  Created by IntelliJ IDEA.
  User: BIG  B0SS
  Date: 2023/1/20
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>添加品牌</title>
</head>
<body>
<h3>添加品牌</h3>
<form action="/brand-demo/AddServlet" method="post">
  品牌名称：<input name="brandName"><br>
  企业名称：<input name="companyName"><br>
  企业排序：<input name="ordered"><br>
  描述信息：<textarea rows="5" cols="20" name="companyDescription"></textarea><br>
  状态：
  <input type="radio" name="status" value="0">禁用
  <input type="radio" name="status" value="1">启用<br>

  <input type="submit" value="提交">
</form>
</body>
</html>

