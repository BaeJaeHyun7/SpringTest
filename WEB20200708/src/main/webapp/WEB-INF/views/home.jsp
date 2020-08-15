<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<!-- 
		action = 폼 태그안에 있는 데이터가 전달될 요청 주소
		method = 폼 태그안에 있는 데이터를 전달할 때 사용할 http method 방식을 지정(get, post)
		태그의 name속성에 지정한 값은 Java쪽의 변수명과 일치 시켜야 한다.
	 -->
	
	
	<form action="/join2" method="post">
		ID : <input type="text" name = "id"><br>
		PW : <input type="password" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br>
		<input type="submit" value="가입">
	</form>







</body>
</html>
