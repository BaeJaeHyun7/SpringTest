<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>메인 화면</title>
</head>
<body>
<h1>
	[ 메인 화면 ] 
</h1>




<h2>
	${gisu }
	
</h2>

<!-- 
	요청주소를 작성할때 반드시 지켜야 하는 규칙
	동일한 요청주소를 작성하지 않는다. 요청주소는 고유해야한다.(유니크)
	회원파트
	/member/memberJoin
	/product/memberJoin
	
	이종호 : /memberJoin
			/member/abc
	배재현 : /memberJoin -- 요러면 안됨 겹치지 않는다면 다됨
			/product/abc -- 요러면 됨
	http://www.naver.com
	
	쿼리스트링 방식
	
	요청주소?변수명=값&변수명=값

 -->

<ul>
	<li>
		<a href="/ex/example1?name ='test'">jsp 파일 이동1</a>
		<a href="/ex/example2">jsp 파일 이동2</a>
		<a href="/ex/example3">jsp 파일 이동3</a>
	</li>
</ul>



</body>
</html>
