<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/15
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"

         pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>首页</title>

</head>

<body>

index<br/>


<table border="1" width="500" align="center">
    <tr>
        <th>depid</th>
        <th>depname</th>
    </tr>
    <%--数据行--%>
    <c:forEach items="${deps}" var="dep" varStatus="s">
        <c:if test="${s.count!=0}">
            <tr bgcolor="red">
                <td>${dep.depid}</td>
                <td>${dep.depname}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>

</body>

</html>