<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

</table>
<html>
<head>
    <!--前端配置文件-->
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge chorme=1">
    <meta name="msapplication-tap-highlight" content="no" />
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="../css/mission8-1.css" rel="stylesheet" type="text/css">
    <!--前端配置文件-->
</head>
<body>
<table>
    <tr>
        <tiles:insertAttribute name="header" />
    </tr>

    <tr>
        <tiles:insertAttribute name="body"/>
    </tr>
    <tr>
        <tiles:insertAttribute name="footer"/>
    </tr>

    <!--前端配置文件-->
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <!--前端配置文件-->
</table>
</body>
</html>