<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="get">
	 姓名：<input id="username" name="username"><br>
	 密码：<input type="password" id="password" name="password"><br>
	 性别：<input type="radio" checked name="sex" id="sex1" value="0">男
	    <input type="radio" name="sex" id="sex2" value="1">女<br>
	爱好： <input type="checkbox" name="hobby" value="0">足球 
	    <input type="checkbox" name="hobby" value="1">篮球
	    <input type="checkbox" name="hobby" value="1">排球<br>
	专业：<select id="major" name="major">
	    <option value="0">软件工程</option>
	    <option value="1">英语</option>   
	    <option value="2">数学</option></select><br>
	简介：<br><textarea id="intro">abc</textarea><br>
	<input type="submit" value="注册用户">
	<input type="reset" value="重置">
	</form>
</body>
</html>