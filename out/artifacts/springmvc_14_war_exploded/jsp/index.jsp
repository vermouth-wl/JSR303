<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-03
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h3>这是主页</h3>
    <div>
        <fm:form method="post" action="../testValidate" modelAttribute="user">
            <div>
                姓名: <fm:input path = "username"/>
                <font color="red"><fm:errors path="username"/></font><br>
                年龄: <fm:input path="age"/>
                <font color="red"><fm:errors path="age"/></font><br>
                邮箱: <fm:input path="email"/>
                <font color="red"><fm:errors path="email"/></font><br>
            </div>
            <div>
                <input type="submit" value="提交"/>
            </div>
        </fm:form>
    </div>
</body>
</html>
