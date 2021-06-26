<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 2021/6/24
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        <img src="${pageContext.request.contextPath}${detailVo.imgPath}">
        <p>片名:${detailVo.name}</p>
        <p>导演:${detailVo.director}</p>
        <p>类型:${detailVo.type}</p>
        <p>国家:${detailVo.country}</p>
        <p>上映时间:${detailVo.displayTime}</p>
        <p>语言:${detailVo.lan}</p>
        <p>片长:${detailVo.length}</p>
        <p>剧情介绍:${detailVo.introduction}</p>
    </div>

</body>
</html>
