<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${retStr}
</h1>
<form id="frm" action="${home }cal">
    <p>값 입력:</p>
    <div><input type="text" id="num1" name="num1"></div>
    <div><input type="text" id="num2" name="num2"></div>
    <div><input type="submit" value="전송"></div>
</form>
</body>
</html>
