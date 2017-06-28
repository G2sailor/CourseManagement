<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manager Info</title>
</head>
<body>
<h3>这是测试取值的demo  取manager属性值</h3><br>
<c:forEach items="${info}" var="info">
    <jsp:text>管理员用户名：</jsp:text><c:out value="${info.managername}" /><br>
    <jsp:text>管理员密码：</jsp:text><c:out value="${info.managerpassword}" /><br>
</c:forEach>
</body>
</html>
