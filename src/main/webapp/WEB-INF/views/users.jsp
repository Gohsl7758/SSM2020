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
        <th>uid</th>
        <th>uname</th>
    </tr>
    <%--数据行--%>
    <c:forEach items="${users.rows}" var="user" varStatus="s">
        <c:if test="${s.count!=0}">
            <tr>
                <td>${user.uid}</td>
                <td>${user.username}</td>
                <td>${user.depid}</td>
<%--                <td><a href="users?depid=${dep.depid}">${dep.depname}</a></td>--%>
            </tr>
        </c:if>
    </c:forEach>
</table>

<%--<table border="1" width="500" align="center">--%>
<%--    <tr>--%>
<%--        <th>depid</th>--%>
<%--        <th>depname</th>--%>
<%--    </tr>--%>
<%--    &lt;%&ndash;数据行&ndash;%&gt;--%>
<%--    <c:forEach items="${deps.rows}" var="dep" varStatus="s">--%>
<%--        <c:if test="${s.count!=0}">--%>
<%--            <tr>--%>
<%--                <td>${dep.depid}</td>--%>
<%--                <td><a href="users?depid=${dep.depid}">${dep.depname}</a></td>--%>
<%--            </tr>--%>
<%--        </c:if>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--<div height="24"></div>--%>

<%--<table  width="461" height="24" border="1" cellpadding="0" cellspacing="0" align="center">--%>
<%--    <tr>--%>
<%--        <td width="199" maxFractionDigits="0">当前为第${deps.page}页,共${Math.round(deps.total/deps.size)}页</td>--%>
<%--        <td width="256">--%>
<%--            <c:choose>--%>
<%--                <c:when test="${deps.page!=1}">--%>
<%--                    <a href="changepage?page=1">首页</a> |--%>
<%--                    <a href="changepage?page=${deps.page-1}">上一页</a>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    首页 | 上一页--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>

<%--            <c:choose>--%>
<%--                <c:when test="${deps.page!=Math.round(deps.total/deps.size)}">--%>
<%--                    <a href="changepage?page=${deps.page+1}">下一页</a> |--%>
<%--                    <a href="changepage?page=${Math.round(deps.total/deps.size)}">尾页</a>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    下一页 | 尾页--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>

<%--        </td>--%>
<%--    </tr>--%>
<%--</table>--%>

</body>

</html>