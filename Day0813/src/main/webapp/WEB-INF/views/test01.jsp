<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="crossorigin="anonymous"></script>

<script type="text/javascript">

//window.onload = function() {alert("Hello,World!")} // 1.자바스크립트 고유의 문법을 사용한것


//2.제이쿼리에서 만들어진 프레임워크를 사용한것
$(document).ready(function(){
	alert("Hello, World!");
	});


//3. 제이쿼리 극단적으로 줄인코드
	$(function(){
		alert("Hello, World!")
		});
	

//1,2는 같은기능이다.

	//함수를 변수처럼 만들수있다. 익명함수로 만들수있다.  function()은 익명함수이다. 마치 변수에 저장하듯이
	/* var a = function(){

		}

	alert(typeof a) 								// function  함수라는 자료형이 출력된다.*/ 

</script>
	 



</head>
<body>

</body>
</html>