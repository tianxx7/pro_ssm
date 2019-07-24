<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2018/10/12
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="./static/js/jQuery/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2>hellow world</h2>
<button id="getALl">getAllEmp</button>
<a href="./emp/getOneEmp.do?id=7839">getEmp</a>
<form action="./file/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit">
</form>
</body>
<script>
    $("#getALl").click(function(){
        $.ajax({
            url:"./emp/getAllEmp.do",
            contextType:"application/json",
            success:function(data){
            }
        })
    })
</script>
</html>
