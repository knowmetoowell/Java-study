<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-12-05
  Time: 오후 5:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page import="java.util.*" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Access Denied Page</h1>
<h2><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage()}"/> </h2>
<h2><c:out value="${msg}"/> </h2>
</body>
</html>
