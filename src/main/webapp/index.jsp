<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Java Application</title>
</head>
<body>
    <h1>Welcome!</h1>
    <p>This Java web application is deployed on Apache Tomcat.</p>

    <a href="${pageContext.request.contextPath}/hello">
        Open Hello Servlet
    </a>
</body>
</html>
