<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Practice</h1>
<h3>post 방식 요청</h3>
<form action="login" method="post">
    <label>아이디 : </label><input type="text" name="id">
    <br>
    <label>비밀번호 : </label><input type="text" name="password">
    <br>
    <input type="submit" value="login 요청">
</form>
</body>
</html>