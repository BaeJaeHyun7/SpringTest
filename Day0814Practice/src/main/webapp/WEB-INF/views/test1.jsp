<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
	*{
		color: red;
	}

</style>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){

	$("div").css("font-size","200%");

		
	});

	$(function(){


		})
		
	function changeColor(){

	$(".hi").css("color","green")

		}
		
		
		
		
		






</script>

</head>
<body>
	<div id="hello" class="hi" onclick="changeColor();">안녕하세요?</div>
	<div class="hi">반갑습니다!</div>
</body>
</html>