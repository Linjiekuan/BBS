<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" name="formUser" action="userRegister" >
<input id="username" type="text" placeholder="账号" name="username" />
<br/>
<input id="password" type="password" placeholder="密码" name="password" />
<br/>
<input id="email" type="email" placeholder="邮箱" name="email" />
<br/>
<input id="number" type="number" placeholder="电话" name="number" />
<br/>
<button type="submit">注册</button>
</body>
</html>