<%--
  Created by IntelliJ IDEA.
  User: GUILLERMO
  Date: 25/03/2017
  Time: 05:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clientes</title>
</head>
<body>

<s:iterator value="users">
    <s:property value="id"/><br>
    <s:property value="surname"/><br>
    <s:property value="name"/><br>
    <s:property value="sex"/><br>
    <s:property value="phone"/><br>
    <s:property value="rol"/><br>
    <s:property value="skills"/><br>
</s:iterator>
</body>
</html>
