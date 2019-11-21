<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 21/11/2019
  Time: 09:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form action="/calculate" method="get">
    <input type="text" name ="input1">
    <input type="text" name ="input2"><br>
    <input type="submit" value="Addtion(+)" name ="operator">
    <input type="submit" value="Subtraction(-)" name = "operator">
    <input type="submit" value="Multip(*)" name = "operator">
    <input type="submit" value="Division(/)" name="operator"><br>
    <h1>${result}</h1>
  </form>
  </body>
</html>
