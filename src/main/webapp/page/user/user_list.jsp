<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <style type="text/css">
        form{
            margin:0px auto;

            width:500px;
            padding:20px;
        }
    </style>
    <title>用户列表</title>
</head>

<body>
<h1>用户列表</h1>
<table width="500px">
    <tr>
        <td>姓名</td><td>年龄</td><td width="100px">操作</td>
    </tr>
</tr>
</table>
<div id="userList"></div>
</body>
<script type="text/javascript"> var path="<%=basePath%>"</script>
<script type="text/javascript" src="../../javascript/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../../javascript/user/user_list.js"></script>
</html>