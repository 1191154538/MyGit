<%--
  Created by IntelliJ IDEA.
  User: yzc
  Date: 2018/11/23
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
啊 AAA
<c:forEach items="${requestScope.list}" var="l">

    ${l.id}


</c:forEach>
</body>
</html>
