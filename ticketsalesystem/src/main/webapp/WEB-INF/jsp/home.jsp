<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 2021/6/23
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <c:forEach items="${filmList}" var="film">
                <td>
                    <div>
                        <a href="filmDetail?film_id=${film.film_id}" style="">
                        <img src="${pageContext.request.contextPath}${film.film_path}">
                        <p>导演:${film.director}</p>
                        <p>电影名称:${film.film_name}</p>
                        </a>
                    </div>
                </td>
            </c:forEach>
        </tr>
    </table>


</body>
</html>
